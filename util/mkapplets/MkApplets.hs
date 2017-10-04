{-# LANGUAGE OverloadedStrings, QuasiQuotes #-}

import System.FilePath
import System.Directory
import System.Process
import System.Exit

import Control.Monad

import Data.Maybe
import Data.List

import qualified Data.Text.Lazy as T
import qualified Data.Text.Lazy.IO as T

import Text.Heredoc

isJavaFile = (".java" `isSuffixOf`)

findJavaDir dir = do
  ls <- listDirectory dir
  if isJust $ find isJavaFile ls
    then return (Just dir)
    else do
      subdirs <- filterM doesDirectoryExist (map (dir </>) ls)
      firstMaybeM findJavaDir subdirs

main = do
  cwd <- getCurrentDirectory
  ls  <- listDirectory cwd
  dirs <- filterM doesDirectoryExist ls
  mapM_ appletify dirs

appletify dir = do
  m_java_dir <- findJavaDir dir
  case m_java_dir of
    Nothing -> putStrLn $ "No java files found within " ++ dir
    Just java_dir -> do
      java_dir_ls <- listDirectory java_dir
      let java_files = map (java_dir </>) $ filter isJavaFile java_dir_ls
          isGraphicsProgram file = do
            contents <- T.readFile file
            return ("extends GraphicsProgram" `T.isInfixOf` contents)
      m_gp_file <- findM isGraphicsProgram java_files
      case m_gp_file of
        Nothing -> putStrLn $ "No GraphicsProgram found within src dir " ++ java_dir
        Just gp_file -> do
          compile gp_file
          mkHtml dir gp_file

compile java_file = do
  let classpath = "acm.jar:" ++ takeDirectory java_file
  (exit_code, _out, errors) <- readProcessWithExitCode "javac" ["-cp", classpath, java_file] ""
  case exit_code of
    ExitSuccess -> putStrLn $ "Compiled " ++ java_file ++ " (and dependencies)"
    ExitFailure _ -> do
      putStrLn $ "Compilation of " ++ java_file ++ " failed:"
      putStr errors
      putStrLn ""
      putStrLn ""

mkHtml name gp_file = do
  let html = [str|<applet code="|] ++ takeBaseName gp_file ++ [str|" archive="acm.jar" width="200" height="200" codebase="|] ++ takeDirectory gp_file ++ [str|"></applet>|]
  writeFile (name ++ ".html") html
  copyFile "acm.jar" (takeDirectory gp_file </> "acm.jar")  -- this needs to be in the same dir as class
  putStrLn $ "Wrote applet file for " ++ name

firstMaybeM :: Monad m => (a -> m (Maybe b)) -> [a] -> m (Maybe b)
firstMaybeM _ [] = return Nothing
firstMaybeM f (x:xs) = do
  result <- f x
  if isJust result
    then return result
    else firstMaybeM f xs

findM :: Monad m => (a -> m Bool) -> [a] -> m (Maybe a)
findM _ [] = return Nothing
findM f (x:xs) = do
  result <- f x
  if result
    then return (Just x)
    else findM f xs
