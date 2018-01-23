---
title: CS 113 Lab 1
---

<div id="header">

| **CS 113 Lab #1**
| Spring 2018

</div>

<div id="linkback">

[Back to syllabus](../syllabus.html)

</div>

The bulk of this lab is in installing Eclipse and the ACM library, the
software we will use to program in Java all semester. This lab is *not*
typical of labs in this course. Most of the time, you'll be working with
a partner/group to solve problems. But before we can do that fun stuff,
we have to install the software.

The instructions below sometimes call out special instructions for macOS and
for Windows users. If you have neither of these (because you have Linux, or
something even more exotic), then just do your best. I'm happy to help.

1. Configure your computer to show file extensions:

   *  On a Mac: Make sure you're in the `Finder` app (e.g., click on your desktop).
      Go to the `Finder` menu and choose `Preferences...`. In the `Advanced` tab,
      choose to `Show all filename extensions`.

      If you also want to see hidden files (useful, but not strictly necessary,
      for the `.metadata` folder we'll be encountering soon):

      - macOS Sierra/High Sierra (v10.12 or v10.13): In any Finder window, press Cmd-Shift-.

      - Previous versions of macOS: See the "long way" instructions [here](https://ianlunn.co.uk/articles/quickly-showhide-hidden-files-mac-os-x-mavericks/). (It's not very long!)

   *  On Windows: [Read this](https://www.howtohaven.com/system/show-file-extensions-in-windows-explorer.shtml). These instructions also have you show hidden files/folders,
      which I have found more necessary on Windows than on Mac.

2. Download [cs113.zip](cs113.zip) to a convenient spot where you wish to store your
   coursework. On many computers, it will end up in your `Downloads` folder. Don't leave it
   there -- put it somewhere you won't lose it. (Please, don't just put it on your desktop!)

3. Expand the `.zip` file.

   *  On a Mac: Double-click the `cs113.zip` file. A `cs113` folder should appear.

   *  On Windows: Double-clicking the file should reveal a `cs113` folder inside. This
      isn't really a folder -- it's just something stored in the `cs113.zip` file. Drag
      the `cs113` "folder" out from the `cs113.zip` window that appears to expand the
      folder.

    This `cs113` folder is where all your coursework will end up. You may wish to
   consider keeping it in a backed-up location, like a [OneDrive](http://techdocs.blogs.brynmawr.edu/5821) folder or a [Dropbox](http://www.dropbox.com) folder.

    Inside the `cs113` folder should be two items: an `acm.jar` file and a `.metadata` folder.
   (macOS and Linux users may not be able to see the `.metadata` folder, as it's hidden
   by default. That's OK. You don't need to see it to be able to proceed.) The `acm.jar`
   file contains a graphics and animation library we will be using this semester, and the
   `.metadata` folder contains convenient settings for Eclipse, the main program we will
   use to write Java code.

4. Download Eclipse by clicking the main download button on [this page](https://www.eclipse.org/downloads/) ("Get Eclipse OXYGEN") and following the instructions. On a Mac, you get a compressed file you will have to
double-click to expand; Windows users just get the installer `exe` directly. Either way, run
the installer.

    Eclipse is an *integrated development environment* (IDE) that will make Java programming
   much easier than it would be otherwise.

    **Mac users:** Many have had trouble with Java versions. If you are told to download a "legacy"
   Java at this point (with a `More Info...` button), do so. You may also need to download the
   macOS version of Java from [this page](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
   (and no other). Choose the macOS link from the topmost set of downloads.

5. Follow the directions in the installer, choosing the "Eclipse IDE for Java Developers" when
   given a menu of choices. At the end of installation, click the green Launch button.

   *  Mac users will want to right-click the Eclipse icon in the dock (a purple circle with
   horizontal bars), go to `Options` and `Keep in Dock`. You can then use the icon to launch
   Eclipse in the future.

   *  Windows users, by default, get a shortcut to Eclipse on their desktop and in the Start menu.
   You can use these to launch Eclipse in the future.

6. You will be asked to "Select a directory as workspace". Choose `Browse...` and navigate
to the `cs113` folder you unpacked from the `cs113.zip` file in step 3.

   *  On a Mac, it will look like the only thing in the folder is `acm.zip`. If that's what
      you see, you're in the right place.

   *  On Windows, it will look like the only thing in the folder is `.metadata` (with some
      other folders within). If that's what you see, you're in the right place.
      *Don't* click on the `.metadata` though; make sure `cs113` is selected.

    Choose to launch with that workspace.

    A workspace is a folder and settings that you will use for every exercise, assignment,
   and project in this course. Eclipse makes it so that you can easily pick up where you
   left off.

    You may get a warning about updating the workspace. That's fine; go ahead and update.

    Eclipse should now be running. It organizes work into "projects". Generally, you will
   use a separate project for each exercise/lab/assignment/project in this course.

7. Create your first project by clicking the down-arrow next to the
   leftmost icon in the toolbar (it's a window
   with a + in the corner). Choose to create a Java Project.

8. Name the Project `Lab01`. (The exact characters in the
   name don't matter much, but there can't be any spaces or punctuation.)
   Click the `Next >` button, *not* the `Finish` button.

9. In the next screen that appears, click the `Libraries` tab and then the
   `Add External JARs...` button. Choose the `acm.jar` file that should be right
   there. (If it's not right there, navigate to your `cs113` folder; the `acm.jar`
   file is inside.) After choosing the `acm.jar` file, click `Finish` to create
   the project.

10. Create a new Java class (a *class* is the fundamental unit of Java code) by
    clicking the green circle button with a C and a + on it (around the middle of
    the toolbar). Name the class `HelloWorld` (no spaces or punctuation here!) and
    click `Finish`.

    You should have a file that looks like this appear:

```java

public class HelloWorld
{

}

```

11. Edit the file so that it looks like this:

```java
import acm.graphics.*;
import acm.program.*;

public class HelloWorld extends GraphicsProgram
{
  @Override
  public void run()
  {
    GLabel message = new GLabel("Hello, world!", 10, 20);
    add(message);
  }
}
```
    
   Be very careful about punctuation and capitalization here. Java is sensitive
   to these details!

13. The program is now ready to run. Run it as an applet by clicking the "play" button
    (green button with a white triangle pointing right in it). A window should appear
    greeting the world. (You will likely get some red text in Eclipse with an error about
    an `AppletViewer properties file`. That happens the first time you run a Java program
    on your computer and then never again. Don't worry about it.)

14. Below the final `}`, make a new line in the file and type `/* */`. These
characters tell Java that what you write in between is a comment and does not
affect the way the program runs.

15. Type the answers to the following questions in your file, in between the
`/*` and the `*/`. You will need to experiment a little to figure this out.

    a. How can you change what your program displays? For example, make your
    program display "Good afternoon, computer!" instead of "Hello, world". What
    did you need to do to get this to work?

    b. How can you change the location of the text in the window? For example,
    say you wanted to move the text to the right. How would you do that?

    c. How can you make two different chunks of text appear?

16. You're just about done. Now, you will submit your work. It will not be graded,
but submitting allows us to work out any kinks in the submission system. You will
be using [Gradescope](https://gradescope.com/) for submitting all the work in this
course; the site also allows the course staff to return graded work to you. Go to
the Gradescope website and sign up. (It's free for students, and Gradescope meets the privacy
requirements of handling student data.) Use your College email address. When
filling out your name, write it **surname first**; I would enter `Eisenberg, Richard`.
(This helps connect to other systems working behind the scenes. Surnames are less
fungible than forenames!)

    At some point during the registration process, you will need a course code; this
    is what Gradescope uses to link your account with mine. This code is **`9GEG3Y`**.

17. Export your project:

    a. Select your `Lab 01` project in Eclipse.
    b. Right-click and choose to `Export...`
    c. The `Export` dialog box appears. Under `General`, choose `Archive File` and
       click `Next`.
    d. Make sure your project is selected in the list at the top-left of the window
       and that `Save in zip format` and `Create directory structure for files` are
       selected toward the bottom.
    e. `Browse...` to find a good spot to save the file that wil be exported. Name
       the file `Lab01.zip`.
    f. Click `Finish`. Eclipse will create `Lab01.zip` as directed.

18. Submit your `Lab01.zip` file as your submission for lab01. 

19. When you're all done, call me over and tell me of your success.

20. If you have time, play around. See what you can draw!
