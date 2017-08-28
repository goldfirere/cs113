---
title: CS 246 Resources
---

<div id="header">

| **CS 246 Resources**
| Prof. Richard Eisenberg
| Spring 2017

</div>

\$navbar\$

The following links may be helpful to you. Feel free to
[submit a pull request](https://github.com/bmc-cs246/cs246) if you find other good
resources!

 * [Emacs reference card](resources/emacs-refcard.pdf)

 * [GDB reference card](resources/gdb-refcard.pdf)

    See [here](fromhome.html#mac-local) for advice on installing `gdb` on a Mac.
    On Windows, you should work through Cygwin.

 * [GDB/emacs integration details](https://www.gnu.org/software/emacs/manual/html_node/emacs/GDB-Graphical-Interface.html).
   Note that you need to make a `~/.emacs` file with `(setq gdb-many-windows t)` in it to automatically get the fancy
   display I showed in class. (See [here](https://www.gnu.org/software/emacs/manual/html_node/emacs/Init-File.html) for
   more information about the `~/.emacs` file.)

 * [check](https://libcheck.github.io/check/) unit testing library. Click on the "API" tab to see the library documentation.

    Remember to use `gcc -o `*<executable name>*` `*<object files>*` -lcheck` to
    include the *check* library.

    See [this example](04/check_prime.c) for an example of how to use *check*.

    See [here](fromhome.html#mac-local) for advice on installing `check` on a Mac.
    On Windows, you should work through Cygwin.

 * [Makefile reference](https://www.gnu.org/software/make/manual/make.html)

 * [C library reference](http://www.cplusplus.com/reference/clibrary/)

 * [Standard C definition](http://www.open-std.org/jtc1/sc22/wg14/www/docs/n1256.pdf)
