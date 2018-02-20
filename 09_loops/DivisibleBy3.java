/* Name: Richard Eisenberg
 * File: DivisibleBy3.java
 * Description: determines whether a number is divisible by 3
 */
import java.util.*;

public class DivisibleBy3
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		// check to make sure the number is not negative:
		while(num < 0)
		{
			// this will loop as long as the number is negative
			System.out.print("Please enter a non-negative number: ");
			num = in.nextInt();
		}
		
		// this tests if num is divisible by 3 by checking to see if
		// the remainder after dividing by 3 is 0. The % operator in
		// Java computes the remainder after integer division.
		if(num % 3 == 0) 
		{
			System.out.println(num + " is divisible by 3.");
		}
		else
		{
			System.out.println(num + " is not divisible by 3.");
		}
	}
}
