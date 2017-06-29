This directory contains files downloaded from http://cs.stanford.edu/people/eroberts/jtf/ in case
that page ever disappears.

Sadly, the downloads do not include the documentation, which I had to build from scratch. Adding
to my challenges here, the documentation uses non-standard @usage and @noshow tags. I got @usage
working via a taglet, but I don't feel like getting @noshow working.

To build documentation:
 1. Build the taglet, in the taglet directory.
    a. Find the tools.jar file. On a Mac, I ran
       > /usr/libexec/java_home
       which prints out a dir. My tools.jar was in the lib subdir of that dir.
    b. In the taglet directory,
       > javac -classpath <tools.jar> Usage.java

 2. Build the documentation:

    > javadoc -taglet Usage -tagletpath taglet -tag param -tag return -tag noshow:X -d doc -link https://docs.oracle.com/javase/8/docs/api/ acm.io acm.graphics acm.gui acm.program acm.util

