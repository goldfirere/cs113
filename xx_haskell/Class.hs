
fib n = if n <= 1
        then n
        else fib (n-1) + fib (n-2)

f x = x + 5
g x = x^2 - 2*x + 5

h string1 string2 = "Hello, " ++ string1 ++ string2

printUpTo n = do
  if n == 0
  then putStrLn ""
  else do
    printUpTo (n-1)
    print n

main = do
  putStrLn "Hello, world!"  -- putStrLn is just like System.out.println
  putStr "What is your name? "
  name <- getLine
  putStrLn ("Hello, " ++ name)

data City = AmericanCity String  -- city name
                         String  -- state name
          | OtherCity String -- city name
          deriving Show

getCityName :: City -> String
getCityName (AmericanCity city _state) = city
getCityName (OtherCity city)           = city

{-
data [a] = []
         | (a : [a])
-}

a = []
b = 5 : []
c = 5 : 2 : []
d = 7 : 9 : 10 : []

e = [7, 9, 10]

len [] = 0
len (_element : rest) = 1 + len rest

attachToEnd [] element = [element]
attachToEnd (elt1 : list) element = elt1 : attachToEnd list element
