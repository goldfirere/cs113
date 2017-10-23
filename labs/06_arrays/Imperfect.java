/* Name: Richard Eisenberg
 * File: Imperfect.java
 * Desc: Imperfectly identifies perfect numbers
 * 
 * Recall that a number n is perfect if the sum of all of n's divisors
 * equals to n.
 */

import java.util.*;

public class Imperfect
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		System.out.print("What number shall I test? ");
		int num = in.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= num)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == num)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("imperfect");
		}
	}
}
