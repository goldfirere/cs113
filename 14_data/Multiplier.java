/* Name: Richard Eisenberg
 * File: Multiplier.java
 * Desc: Multiplies together the numbers it finds in a file
 */

import java.util.*;
import java.io.*;

public class Multiplier
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Where are the numbers to multiply? ");
		String filename = in.nextLine();
		
		int product = 1; // start at *one*, because we're multiplying
		try(Scanner file = new Scanner(new FileReader(filename)))
		{
			while(file.hasNextInt())
			{
				int n = file.nextInt();
				product = product * n;
			}
			
			// Tell the user if the file still has other stuff
			if(file.hasNext())
			{
				System.out.println("Warning: did not finish reading file.");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found: " + e);
			return; // this returns from main, aborting the program
		}
		
		System.out.println("The product is " + product + ".");
	}
}
