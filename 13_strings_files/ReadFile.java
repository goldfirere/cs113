/* Name: Richard Eisenberg
 * File: ReadFile.java
 * Desc: Reads in the contents of a file and prints them out
 */

import java.util.*;
import java.io.*;

public class ReadFile
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What file shall I read to you? ");
		String filename = in.nextLine();
		
		// These need to be declared *before* the "try" block, because
		// variables declared within braces no longer exist outside of
		// those braces
		int numLines = 0;
		int numCharacters = 0;
		
		// This line opens the file requested and creates a Scanner for
		// easy access to it. (We won't be studying how to access files
		// without a Scanner in this course. But you can learn much with
		// online tutorials.) This is done in a "try" line so that, in
		// case there is an error, Java can close the file when the
		// error happens.
		try(Scanner file = new Scanner(new FileReader(filename)))
		{ // The "file" variable is available only within these braces
			while(file.hasNextLine()) // continue while the file has data
			{
				String line = file.nextLine(); // read one line from the file,
				System.out.println(line);      // print it out,
				numLines = numLines + 1;       // and increment the counters
				numCharacters = numCharacters + line.length();
			}
		}
		// The partner of "try" is "catch". When you try something and it
		// fails, the error ends up in a "catch" block. In our case, we
		// just print the error.
		catch(FileNotFoundException e)
		// The line above declares "e" of type FileNotFoundException
		// The syntax is just like a parameter in a method declaration
		{
			System.out.println("File not found: " + e);
		}
		
		System.out.println("Number of lines read: " + numLines);
		System.out.println("Number of characters read: " + numCharacters);
	}
}
