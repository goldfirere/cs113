/* Name: Richard Eisenberg
 * File: Reverser.java
 * Desc: Tries to print out a list of numbers in reverse order, but fails
 */

import java.util.*;

public class Reverser
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you have? ");
		int numNumbers = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		int i = 0;
		while(i < numNumbers)
		{
			System.out.print("Enter a number: ");
			int n = in.nextInt();
			list.add(n);
			
			i = i + 1;
		}

		System.out.println("Here are the numbers in reverse order:");
		i = numNumbers;
		while(i < numNumbers)
		{
			System.out.println(list.get(i));
			
			i = i - 1; // we're counting *down* here
		}
	}
}
