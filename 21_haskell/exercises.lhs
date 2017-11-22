% -*- LaTeX -*-

\documentclass[12pt]{article}

\usepackage{amsmath}
\usepackage{amssymb}
\usepackage{fullpage}
\usepackage{verbatim}
\usepackage{url}
\usepackage{mdframed}
\usepackage{hyperref}

%include polycode.fmt
%include rae.fmt

%format \> = "\lambda{>}\;"
%format \: = "{:}"

\newenvironment{exercises}{%
\begin{enumerate}
\setcounter{enumi}{\thesaved}
}{%
\setcounter{saved}{\theenumi}
\end{enumerate}
}

\newcommand{\keyword}[1]{\textsf{\textbf{#1}}}
\newcommand{\id}[1]{\textsf{\textsl{#1}}}


% uncomment this line to see solutions:
%\renewenvironment{comment}{}{}

\newcounter{saved}

\begin{document}

\begin{center}
\bf
CMSC 113: Computer Science I\\
First Haskell Exercises
\end{center}

Although it is possible to install Haskell on your computer, we want
to get started quickly, so we will be using an online Haskell programming
system (also called an IDE, for Integrated Development Environment).
\begin{mdframed}
Go to \url{https://repl.it/languages/haskell}
to start a fresh Haskell project.
\end{mdframed}

You should see two vertical panes. Write the following in the left pane:

\begin{code}
main = putStrLn "Hello, world!"
\end{code}

This is a very short Haskell program that prints @Hello, world!@ to the
screen. (|putStrLn| is Haskell's equivalent of @System.out.println@.)

To test it, we will be using the Glasgow Haskell Compiler (or GHC, for
short). GHC comes with an interactive environment, called GHCi.

\begin{mdframed}
Press the ``run'' button toward the top of the screen to load and
run your code. You should see your output in the pane on the right.
\end{mdframed}

After @Hello, world!@ is printed, you should see a prompt in the
right pane.  It is at this prompt that you will type commands
to GHCi. I will abbreviate this prompt with |\>|, which is typically
how the GHCi prompt is shown in writings about Haskell.

Just to make sure all is working:
\begin{mdframed}
Type @main@ at the prompt and press Enter.
\end{mdframed}

(I'm going to leave off the ``press Enter'' part of instructions from now
on.) You should see @Hello, world!@ printed again. That's how you know things
are working.

Now, you will write a function in your file:

\begin{mdframed}
Write the following code in the file (the pane on the left):
\begin{code}
doNothing x = x
\end{code}
Reload your file by pressing the ``run'' button again.
\end{mdframed}

This function does, well, nothing. It takes an argument |x| and returns it. But let's
test it anyway.

Only by pressing the ``run'' button will the window on the right get your updated code.
From now on, I will assume that you reload the file before using any new definitions.

\begin{mdframed}
Enter |doNothing 5| at the prompt.
\end{mdframed}

Writing a Haskell expression at the prompt evaluates the expression and prints the
result of evaluation. You should see |5| displayed back at you.

In Haskell, we don't think of \emph{running functions}, we think
of \emph{evaluating expressions}. This is much closer to mathematics, where we can
define, say, $f(x) = x^2+4x-1$ and then evaluate $f(3)$ to be $20$. Indeed, we can
even do this in Haskell:

\begin{mdframed}
Add this definition to your file:
\begin{code}
f x = x^2 + 4*x - 1
\end{code}
\end{mdframed}

\begin{mdframed}
After reloading, type |f 3| at the prompt.
\end{mdframed}

You should see |20|. This is one of the beauties of Haskell: it's just like math! Type
in a few mathematical expressions in GHCi. You should see the results you expect.
(Haskell does not use parentheses around function arguments as you would in math,
however.)

\section*{Types}
Haskell is a \emph{strongly-typed} language, meaning that nonsense expressions are
rejected.

\begin{mdframed}
Write this at the prompt: |True + "hi"|
\end{mdframed}

See what you get.

\begin{mdframed}
Add a definition |x = True + "hi"| and reload
\end{mdframed}

You should see a similar error. Note that you cannot even ask what the value of |x| is;
just loading the file shows you the error.

Java is also strongly-typed, but Haskell comes equipped with \emph{type inference},
so that you never need to write a type in your program if you don't want to. In GHCi,
you can ask for the type of something with the @:type@ command.

\begin{mdframed}
Remove the erroneous |x| from your file and add this one:
\begin{code}
choose x = if x then "hi" else "bye"
\end{code}
 Then write @:type choose@ at the prompt.
\end{mdframed}

You should see that the type of |choose| is |Bool -> String|. That is, |choose|
is a function that takes a |Bool| argument and returns a |String|. You can
add type signatures to functions if you like. (This sometimes results in better
error messages when you make a mistake.) For example, you could add
|f :: Int -> Int| to your file to declare that your function |f| takes an |Int|
and returns an |Int|.

Once you have all of this working, you're ready to start writing your own code in
the Haskell file.
For each exercise below, write the function requested in your Haskell file. After
each function, switch over to GHCi to test your function and make sure it works
on several different inputs. Good luck!

\section*{Basics}

\begin{exercises}

\item
Write a function named |add1| that takes an |Int| and returns an |Int| that
is one greater than its input. For example, if we compute |add1 5|, we should
get |6|. If you want to write a type signature for |add1|, it would be
|add1 :: Int -> Int| (on a line by itself).
\begin{comment}
\begin{code}
add1 :: Int -> Int
add1 x = x + 1
\end{code}
\end{comment}

\item
Write a function named |always0 :: Int -> Int|.
The return value should always just be 0.

\begin{comment}
\begin{code}
always0 :: Int -> Int
always0 n = 0
\end{code}
\end{comment}

\item
Write a function |subtract :: Int -> Int -> Int| that takes two numbers (that is, |Int|s) and subtracts them.

\begin{comment}
\begin{code}
subtract :: Int -> Int -> Int
subtract a b = a - b
\end{code}
\end{comment}

\item
Write a function |addmult| that takes three numbers. Let's call them |p|, |q|, and |r|.
|addmult| should add |p| and |q| together and then multiply the result by |r|.

\begin{comment}
\begin{code}
addmult :: Int -> Int-> Int -> Int
addmult p q r = (p + q) * r
\end{code}
\end{comment}

\end{exercises}

\section*{Conditionals}

The next function will also need you to use an |if| expression in Haskell. Here is an
example of |if| in action:
%
\begin{code}
greaterThan0 :: Int -> String
greaterThan0 n = if n > 0 then "Yes!" else "No :("
\end{code}
%
You can copy that function definition into your file and try it in GHCi if you
want. Note that both the |then| part \emph{and} the |else| part are required in
Haskell. If you left the |else| out, what would happen if |n| weren't greater than 0?
There's no good answer to that question, so the |else| is always required.

\begin{exercises}

\item
Write a function |myAbs| that computes absolute value. (Don't use the
built-in function |abs| --- that's cheating!)

\begin{comment}
\begin{code}
myAbs :: Int -> Int
myAbs n = if n < 0 then (-n) else n
\end{code}
\end{comment}

\item
Write a function |pushOut| that takes a number and returns the number
that is one step further from 0. That is, |pushOut 3| is |4|, |pushOut (-10)|
is |(-11)|, and |pushOut 0| is |0|. That last one is because we don't know
which direction to go! Note that, in Haskell, you \emph{always} have to
put parentheses around negative numbers.

\emph{Hint:} Use \texttt{==} for equality checking in Haskell, just like Java.

\begin{comment}
\begin{code}
pushOut :: Int -> Int
pushOut n =  if n > 0
             then  n + 1
             else  if n < 0
                   then  n - 1
                   else  0
\end{code}
\end{comment}

\end{exercises}

\section*{Strings}

All of the functions so far have dealt only with numbers. Now, we'll look
at |String|s, which are chunks of printable text. |String|s are written
in double-quotes in Haskell:
%
\begin{code}
exampleString :: String
exampleString = "Hello there!"
\end{code}
%
There are
two interesting operations on |String|s (for now):
\begin{itemize}
\item Use the |++| (written
like \texttt{++}) operator to concatenate |String|s. To concatenate is to put
one after the other. For example, |"Hi " ++ "there!"| is |"Hi there!"|. This
is quite like |+| in Java on strings.
\item Use |show| to convert most types into |String|s. For example, |show 3|
  is |"3"|. 
\end{itemize}

\begin{exercises}

\item
Write a function |greet| (with type |String -> String|) that takes in a 
person's name and says |"Hi "| to that person. For example,
|greet "Haskell"| is |"Hi Haskell"|. (The language Haskell is named after
a logician, Haskell Curry.)

\begin{comment}
\begin{code}
greet :: String -> String
greet person = "Hi " ++ person
\end{code}
\end{comment}

\item
Write a function |greet2| that is just like |greet|, but if the name
provided is empty, your function should return |"Hi there"|. So, giving
an empty string, written |""|, is like giving the string |"there"|.
To test a string for emptiness, use the |null| function, of
type |String -> Bool|.\footnote{That type is a tiny white lie. |null|
actually works on any kind of list, not just |String|s. But I'm getting
ahead of myself.} |null ""| is |True|, while |null "Esmerelda"| is |False|.

\begin{comment}
\begin{code}
greet2 :: String -> String
greet2 person =  if null person
                 then  "Hi there"
                 else  "Hi " ++ person
\end{code}
\end{comment}

\end{exercises}

\section*{Recursion}

The functions up until now have all been fairly simple. The next function, however,
must perform an operation many times. Haskell's way of repeating an operation is
\emph{recursion}, the act of a function calling itself. As long as the function's
argument(s) keep getting smaller, this doesn't cause a problem---Haskell knows
what to do.

For example, here is a function that makes a |String| containing any number
of \texttt{a}s:
%
\begin{code}
makeAs :: Int -> String
makeAs n =  if n == 0
            then  ""
            else  "a" ++ makeAs (n-1)
\end{code}
%
For example, |makeAs 3| is |"aaa"| and |makeAs 7| is |"aaaaaaa"|.

\begin{exercises}

\item
Write a function |twiceAs| that is like |makeAs|, but it makes twice
as many \texttt{a}s as requested.

\begin{comment}
\begin{code}
twiceAs :: Int -> String
twiceAs n =  if n == 0
             then  ""
             else  "aa" ++ twiceAs (n-1)
\end{code}
\end{comment}

\item
Write a function |countDown| (with type |Int -> String|) that produces a
|String| counting down from a number. For example |countDown 5| is
|"5 4 3 2 1 "|. Note that there is an extra space at the end --- that's
supposed to make it easier. (Bonus points if you can get rid of the
extra space!) If the number passed in is |0| or less, the returned
|String| should be |"Too low"|. Remember that |show| converts a number
to a |String|.

\begin{comment}
\begin{code}
countDown :: Int -> String
countDown n =  if n == 1
               then  "1"
               else  if n > 1
                     then  (show n) ++ " " ++ countDown (n-1)
                     else  "Too low"
\end{code}
\end{comment}

\item
Write a function |countUp| that goes the opposite way of |countDown|.

\begin{comment}
\begin{code}
countUp :: Int -> String
countUp n =  if n == 1
             then  "1"
             else  if n > 1
                   then  countUp (n-1) ++ " " ++ (show n)
                   else  "Too low"
\end{code}
\end{comment}

\item
Write a function |mult| (with type |Int -> Int -> Int|) to multiply two
numbers without using built-in multiplication. To do this, you will use
repeated addition. Writing it out in mathematical notation:
\[
a \cdot b = \begin{cases} 0 & \text{if } b=0 \\ 
                          a + a \cdot (b-1) & \text{if } b>0
                          \end{cases}
\]
To compute |mult a b|, check |b|. If |b| is |0|, then |mult a b| should
be |0|. If |b| is greater than 0, |mult a b| should be |a| plus the
result of |mult a (b-1)|.

\begin{comment}
\begin{code}
mult :: Int -> Int -> Int
mult a b =  if b == 0
            then  0
            else  a + (mult a (b-1))
\end{code}
\end{comment}

\item
Write a function |power| that raises a number |a| to the power |b|.
This is quite similar to the last exercise. Here is the mathematical
notation for it:
\[
a^b = \begin{cases} 1 & \text{if } b=0 \\
                    a \cdot a^{b-1} & \text{if } b>0
                    \end{cases}
\]

\begin{comment}
\begin{code}
power :: Int -> Int -> Int
power a b =  if b == 0
             then  1
             else  mult a (power a (b-1))
\end{code}
\end{comment}

\item
Triangular numbers are the sum of consecutive numbers. They are called
triangular because, if you have a triangular number of pillows,
then you can make a triangle of pillows. Here are the first several
triangular numbers:
%
\begin{align*}
1 &= 1 \\
3 &= 1 + 2 \\
6 &= 1 + 2 + 3 \\
10 &= 1 + 2 + 3 + 4 \\
15 &= 1 + 2 + 3 + 4 + 5
\end{align*}
%
Write a function |triangle| which, when given |n|, computes the
|n|th triangular number.

\begin{comment}
\begin{code}
triangle :: Int -> Int
triangle n =  if n == 0
              then  0
              else  n + triangle (n-1)
\end{code}
\end{comment}

\end{exercises}

When enough of the room has reached this point, we'll continue by reviewing
alebraic datatypes before going on to more exercises. If you get here before
your peers, please offer to help them out! Or, check out Haskell online, for
example at \url{planet.haskell.org}.\\[2ex]

\hrule ~ \\[2ex]

\section*{Algebraic datatypes}

\noindent Type the following definition of |Pet| into your Haskell file:
%
\begin{code}
data Pet  = Cat String
          | Dog String String
\end{code}
%
Both kinds of |Pet| take a |String| parameter to represent the pet's name.
The |Dog| also takes a second |String| parameter to store the dog's breed.

\begin{exercises}

\item
Write a |speak| function (with type |Pet -> String|) that uses pattern
matching to return |"Meow!"| when given a |Cat| and |"Woof!"| when given
a |Dog|.

\begin{comment}
\begin{code}
speak :: Pet -> String
speak (Cat n)    = "Meow!"
speak (Dog n b)  = "Woof!"
\end{code}
\end{comment}

\item
Write a |petName| function (with type |Pet -> String|) that returns
a pet's name.

\begin{comment}
\begin{code}
petName :: Pet -> String
petName (Cat n)    = n
petName (Dog n b)  = n
\end{code}
\end{comment}

\item
Write a |breedString| function (with type |Pet -> String|) that returns a
dog's breed. If given a |Cat|, |breedString| should return |"Cats don't have
breeds!"|.\footnote{Cats \emph{do} have breeds, of course, but let's pretend.}

\begin{comment}
\begin{code}
breedString :: Pet -> String
breedString (Cat n)    = "Cats don't have breeds!"
breedString (Dog n b)  = b
\end{code}
\end{comment}

\end{exercises}

The next several exercises will involve the type |Maybe|, which optionally
stores a value. |Maybe| is built-in to Haskell,\footnote{That's another small
lie. |Maybe| is defined in the |Prelude|, which is automatically imported
into every Haskell file. This is rather like Java's @java.lang.*@ package.}
so you don't have to put this in your file, but here is its definition for
reference:
%
\begin{spec}
data Maybe a  = Nothing
              | Just a
\end{spec}

\begin{exercises}

\item
Write a |breed| function that has type |Pet -> Maybe String|. It should
return |Just| the dog's breed when given a |Dog| and |Nothing| when
given a |Cat|.

\begin{comment}
\begin{code}
breed :: Pet -> Maybe String
breed (Cat n)    = Nothing
breed (Dog n b)  = Just b
\end{code}
\end{comment}

\item
Write a |maybeDiv| function that takes two |Int|s and optionally returns an
|Int|. It should divide its two arguments (using the built-in function |div ::
Int -> Int -> Int| --- don't use |/|!) only when the second argument is not
|0|. If the second argument is |0|, it should return |Nothing|. Use
pattern-matching, not an |if| expression!

\begin{comment}
\begin{code}
maybeDiv :: Int -> Int -> Maybe Int
maybeDiv x 0 = Nothing
maybeDiv x y = Just (div x y)
\end{code}
\end{comment}

\item
Rewrite your |pushOut| function (call the new one |pushOut2|) to use
pattern guards instead of |if| expressions. For example, here is
|greaterThan0| written with guards:
%
\begin{code}
greaterThan0_2 :: Int -> String
greaterThan0_2 n
  | n > 0      = "Yes!"
  | otherwise  = "No :("
\end{code}

\begin{comment}
\begin{code}
pushOut2 :: Int -> Int
pushOut2 0 = 0
pushOut2 n
  | n > 0      = n + 1
  | otherwise  = n - 1
\end{code}
\end{comment}

\item
Write a function |maybePlus :: Maybe Int -> Maybe Int -> Maybe Int|
that adds two |Int|s, each of which may or may not exist. If either one
is |Nothing|, just return |Nothing|. Remember: no |if| expressions!

\begin{comment}
\begin{code}
maybePlus :: Maybe Int -> Maybe Int -> Maybe Int
maybePlus Nothing   y         = Nothing
maybePlus x         Nothing   = Nothing
maybePlus (Just x)  (Just y)  = Just (x + y)
\end{code}
\end{comment}

\end{exercises}

Now, hold up here until we learn about lists.\\[2ex]

\hrule ~ \\[2ex]

\section*{Lists}

\begin{exercises}

\item
Write a function |myLength :: [a] -> Int| that computes the length of
a list.

\begin{comment}
\begin{code}
myLength :: [a] -> Int
myLength []     = 0
myLength (a:b)  = 1 + myLength b
\end{code}
\end{comment}

\item
Write a function |listSum :: [Int] -> Int| that adds up all the numbers
in a list.

\begin{comment}
\begin{code}
listSum :: [Int] -> Int
listSum []     = 0
listSum (h:t)  = h + listSum t 
\end{code}
\end{comment}

\item
Write a function |myReverse :: [a] -> [a]| that reverses a list. You will
probably want to use |++|, which appends (concatenates) two lists.

\begin{comment}
\begin{code}
myReverse :: [a] -> [a]
myReverse []     = []
myReverse (h:t)  = reverse t ++ [h]
\end{code}
\end{comment}

\item
Write a function |listUp :: Int -> [Int]| that creates a list from |1|
up to the number passed in. For example, |listUp 3| is |[1,2,3]|.

\begin{comment}
\begin{code}
listUp :: Int -> [Int]
listUp 0  = []
listUp n  = listUp (n-1) ++ [n]
\end{code}
\end{comment}

\item
Write a function |myLast :: [a] -> Maybe a| that returns the last element
of a list, if such an element exists.

\begin{comment}
\begin{code}
myLast :: [a] -> Maybe a
myLast []     = Nothing
myLast [x]    = Just x
myLast (h:t)  = myLast t
\end{code}
\end{comment}

\item
Write a function |palindrome :: String -> Bool| that checks if a string
is a palindrome or not. (A palindrome is a word, like \textsl{level} or
\textsl{racecar}, that reads the same forward or backward.) In Haskell,
a |String| is actually a list of |Char|s (that is, |String| is the same
as |[Char]|), so you can use, say, |myReverse| if you want.

\begin{comment}
\begin{code}
palindrome :: String -> Bool
palindrome s = s == myReverse s
\end{code}
\end{comment}

\end{exercises}

Reflect for a moment at how hard these last few would be in Java!\\[2ex]

\hrule ~ \\[2ex]

There's plenty more to learn! Here are two books, freely available online,
that might be good places to start:
\begin{itemize}
\item \emph{Real World Haskell}, by Bryan O'Sullivan, Don Stewart, and John Goerzen
\item \emph{Learn You a Haskell for Great Good}, by Miran Lipova\v{c}a
\item The FP Complete \emph{School of Haskell}, at \url{fpcomplete.com}
\item This tutorial, in particular, seems worthwhile: \url{https://www.schoolofhaskell.com/school/starting-with-haskell/introduction-to-haskell}
\end{itemize}

\end{document}

