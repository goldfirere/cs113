/* Name: Richard Eisenberg
 * File: Min.java
 * Description: Finds and reports the minimum in a set of numbers
 */
import java.util.*;

public class Min
{
	public static void main(String[] args)
	{
		// set up input:
		Scanner in = new Scanner(System.in);
		
		// greet user:
		System.out.println("Welcome to the minimizer!");
		
		// how many numbers do we have?
		System.out.print("How many numbers in your set? ");
		int num = in.nextInt();
		
		// use a loop to ask the user for the numbers
		ArrayList<Integer> values = new ArrayList<>();
		
		// loop to ask for nums
		int i = 0;
		while(i < num)
		{
			// use (i + 1) so that it counts from 1, not 0
			System.out.print("Enter #" + (i + 1) + ": ");
			int oneNumber = in.nextInt();
			values.add(oneNumber);
			
			i = i + 1;
		}
		
		// now, use a loop to find the minimum.
		
		int min = values.get(0); // store the first value in min
		
		// three part loop to access the array
		i = 0;
		while(i < values.size())
		{
			// if the current value is less than min, update min:
			if(values.get(i) < min)
			{
				min = values.get(i);
			}
			
			i = i + 1;
		}
		
		// print out the minimum
		System.out.print("The minimum is " + min + ".");
	}
}
