/* Name: Richard Eisenberg
 * File: Square.java
 * Desc: Demonstrates using a method in a console program
 */

import java.util.*;

public class Square
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		// this calls the method below; note that we don't need anything
		// before the name of the method. This is because we're calling
		// a method in the same class as we're defining it.
		int squared = calcSquare(num);
		System.out.println("The square of " + num + " is " + squared + ".");
	}
	
	// Defining a method in a console program is much like defining
	// it in a graphical program. The only difference is that we need
	// the keyword "static" here. In brief, this is because static methods
	// can't easily call non-static methods -- and `main` is static.
	
	// This method takes an integer parameter and returns an integer.
	public static int calcSquare(int n)
	{
		return n * n;
	}
}
