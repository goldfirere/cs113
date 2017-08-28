---
title: CS 246 Style Guide
---

<div id="header">

| **CS 246 Style Guide**
| Prof. Richard Eisenberg
| Spring 2017

</div>

\$navbar\$

Code Formatting Standards and Guidelines
========================================

All organizations and companies have specific conventions for formatting code.
While these formatting rules may vary from place to place, they are essential
for making your code readable and for enabling others to understand, use, and
modify your code in the future.

While I do not expect anyone (including myself) to follow all the rules,
[here](https://www.doc.ic.ac.uk/lab/cplus/cstyle.html) is a *very* detailed
guide used as an inspiration for the notes below.

Naming Conventions
------------------

 * Use meaningful names!  For example, if your program needs a variable to represent the radius of a circle, call it `radius`, *not* `r` and *not* `rad`.
 * Use single letter variables for simple loop indices *only*.
 * The use of very obvious, common, meaningful abbreviations is permitted. For example, "number" can be abbreviated as "num" as in `num_students`.
 * Names in C generally are written in lowercase, using underscores to separate words.
 * Constants written with `#define` are written in ALL_CAPS.
 * Types should have a `_t` suffix.

Whitespace
----------

The most-readable programs are written with prudent use of whitespace
(including both blank lines and spaces).

 * Use blank lines to separate major parts of a source file or function. These are like paragraph breaks in English writing.
 * After every `{`, indent by at least 2 spaces until the matching `}`.
 * Separate an operator from its operands by spaces.

File header comments
--------------------

Every source code file should contain a header comment that describes the
contents of the file and other pertinent information. It must include the
following information:

  * The assignment number
  * Your name
  * Your school e-mail address
  * A description of the contents of the file

For example:

```c
/*****************************************
 * Assignment 4
 * Name:    Barbara Smith
 * E-mail:  bsmith22@brynmawr.edu
 *
 * The main driver program for project 4.
 *
 * This program reads the file specified as the first command line
 * argument, counts the number of words, spaces, and characters and
 * displays the results in the format specified in the project description.
 *
 *****************************************/
```

Variable comments
-----------------

*All* global variables must be commented. Most local variables should be commented, too.

*All* members of a `struct` definition must be commented.

Function comments
-----------------

*All* functions should be commented. The comments should explain what the function
does, what its parameters are (not just their types!), and what it returns. Another
way to consider function comments is to imagine a contract: "If the caller of the function
does xyz, then the function will do abc." The "xyz" there are called pre-conditions,
and the "abc" there are called the post-conditions.

In-Line Comments
----------------

You should strive for your code to be self-explanatory. However, it is inevitable
that some lines of code are more intricate. In these cases, a comment describing
the code is well-advised. The comment should *not* simply translate the code to
English, but should explain what's really going on. For example:

```c
// Unhelpful comment:
star_sides = 5; // set star_sides to 5

// Helpful comment:
star_sides = 5; // reset star_sides to original value
```

Well-structured code will be broken into logical sections that perform a simple task. Each of these sections of code (typically starting with an `if` statement or a loop) should be documented.

An in-line comment too long to appear to the right of your code
appears above the code to which it applies and is indented to the same level as the code. For example:

```c
// increment all the odd values in the array
for (i = 0; i < n; i++) {
    // add 1 only to the odd values
    if (array[i] % 2 == 1) {
        array[i] = array[i] + 1;
    }
}
```

Indentation Styles
------------------

Choose one of the two styles and use it consistently (note how the braces
are placed):

```c
if (condition) {                            if (condition)
    ...                                     {                    
} else if (condition) {                         ...
    ...                                     }
} else {                                    else if (condition)
    ...                                     {
}                                               ...
                                            }
                                            else
                                            {
                                                ...
                                            }


for (loop control expressions) {            for (loop control expressions)
    ...                                     {
}                                               ...
                                            }


while (condition) {                         while (condition)
   ...                                      {
}                                               ...
                                            }


do {                                        do
   ...                                      {
} while (condition);                            ...
                                            } while (condition);
                                           

switch (variable) {                         switch (variable)
   case constant1:   ...                    {
        break;                                  case constant1:   ...
   case constant2:   ...                             break;
        break;                                  case constant2:   ...
   case default:     ...                             break;
}                                               case default:     ...
                                            }
```
