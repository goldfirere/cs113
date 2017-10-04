{-# LANGUAGE QuasiQuotes, TypeApplications #-}

-- Makes all non-. directories within the current one into projects with
-- the "ACM" variable added

import System.Directory
import System.FilePath
import System.IO
import System.Environment

import Control.Exception
import Control.Monad

import Data.Maybe
import Data.List

import Text.Heredoc -- package "heredoc"

main = do
  cwd <- getCurrentDirectory
  ls  <- listDirectory cwd
  let no_dots = filter ((/= '.') . head . takeFileName) ls
  dirs <- filterM doesDirectoryExist no_dots
  args <- getArgs
  case args of
    ["delete"] -> mapM_ unprojectify dirs
    []         -> mapM_ projectify dirs
    _          -> putStrLn "Either pass no arguments or \"delete\""

findJavaDir dir = do
  let size_prefix = length $ splitPath dir
  fmap (joinPath . drop size_prefix . splitPath) <$> go dir
  where
    go dir = do
      ls <- listDirectory dir
      if isJust $ find (".java" `isSuffixOf`) ls
        then return (Just dir)
        else do
          subdirs <- filterM doesDirectoryExist ls
          firstMaybeM findJavaDir subdirs

projectify dir = do
  m_java_dir <- findJavaDir dir
  case m_java_dir of
    Nothing -> putStrLn $ "No java subdirectory found within " ++ dir
    Just java_dir -> do
      withFile (dir </> ".classpath") WriteMode $ \cp_file -> do
        hPutStr cp_file [str|<?xml version="1.0" encoding="UTF-8"?>
                            |<classpath>
                            |  <classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/>
                            |  <classpathentry kind="src" path="|]
        hPutStr cp_file java_dir
        hPutStr cp_file [str|"/>
                            |  <classpathentry kind="var" path="ACM"/>
                            |  <classpathentry kind="output" path="bin"/>
                            |</classpath>
                            |]
      withFile (dir </> ".project") WriteMode $ \pr_file -> do
        hPutStr pr_file [str|<?xml version="1.0" encoding="UTF-8"?>
                            |<projectDescription>
                            |  <name>|]
        hPutStr pr_file (takeFileName dir)
        hPutStr pr_file [str|</name>
                            |    <comment></comment>
                            |    <projects>
                            |    </projects>
                            |    <buildSpec>
                            |      <buildCommand>
                            |        <name>org.eclipse.jdt.core.javabuilder</name>
                            |        <arguments>
                            |        </arguments>
                            |      </buildCommand>
                            |    </buildSpec>
                            |    <natures>
                            |      <nature>org.eclipse.jdt.core.javanature</nature>
                            |    </natures>
                            |  </projectDescription>
                            |]

      putStrLn $ "Projectified " ++ dir ++ " with source dir " ++ java_dir

unprojectify dir = do
  ignoreExceptions $ removeFile (dir </> ".classpath")
  ignoreExceptions $ removeFile (dir </> ".project")
  putStrLn $ "Removed files from " ++ dir

firstMaybeM :: Monad m => (a -> m (Maybe b)) -> [a] -> m (Maybe b)
firstMaybeM _ [] = return Nothing
firstMaybeM f (x:xs) = do
  result <- f x
  if isJust result
    then return result
    else firstMaybeM f xs

ignoreExceptions :: IO () -> IO ()
ignoreExceptions thing = do
  _ <- try @SomeException thing
  return ()
