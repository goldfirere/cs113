/* Name: Richard Eisenberg
 * File: Recursion.java
 * Desc: Examples of recursion
 */

public class Recursion
{
	public static void main(String[] args)
	{
		printUpTo(10);
		
		System.out.println(multiply(2, 3));
		System.out.println(multiply(6, 8));
		
		System.out.println(sumDigits(1234));
		
		System.out.println(revString("hello"));
	}
	
	public static void printUpTo(int n)
	{
		// base case: n <= 0. Nothing to do there.
		if(n > 0)
		{
			// Recursive case.
			printUpTo(n-1);  // print all the smaller numbers, and then...
			System.out.println(n); // ... print n
		}
	}
	
	// This multiplies without using *, but by repeated addition.
	public static int multiply(int a, int b)
	{
		if(a == 0)
		{ // Base case: a == 0.
			return 0;
		}
		else
		{ // Recursive case
			return b + multiply(a-1, b);  // note that the first parameter
			                              // decreases. Otherwise, we'd have
			                              // infinite recursion
		}
	}
	
	// This sums the digits in a number
	public static int sumDigits(int n)
	{
		if(n == 0)
		{ // base case
			return 0;
		}
		else
		{
			// Add the last digit to the sum of the other digits
			return n % 10 + sumDigits(n / 10);
		}
	}
	
	// This reverses the characters in a string
	public static String revString(String s)
	{
		if(s.length() == 0)
		{
			// base case
			return s; // nothing to do for empty string
		}
		else
		{ // recursive case: place the first character after the reversed
			// rest of the string.
			return revString(s.substring(1)) + s.substring(0, 1);
		}
	}
}