import java.util.*;

public class Perfect
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		/*
		 * First, find all the number's divisors.
		 * To do that, check whether the remainder is 0 when dividing by lots of numbers
		 * Store all the divisors; add them together.
		 * Check whether the sum equals a copy of the original number.
		 * 
		 * Set s to 0.
		 * Set d to 1.
		 * In a loop:
		 *   Check whether d divides into our number
		 *   If it does, add it to s.
		 *   Set d to d + 1.
		 *   Stop when d gets to our number
		 * Check whether s equals a copy of the original number.
		 */
		
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		
		int s = 0;
		int d = 1;
		while(d < number)
		{
			if(number % d == 0)
			{
				s = s + d;
			}
			d = d + 1;
		}
		
		if(s == number)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Imperfect.");
		}
	}
}
