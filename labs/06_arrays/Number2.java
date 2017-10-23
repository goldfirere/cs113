/* Name: Richard Eisenberg
 * File: Number2.java
 * Description: counts positive and negative numbers
 */
import java.util.*;

public class Number2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers? ");
		int numNums = in.nextInt();
		in.nextLine();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// read the numbers in:
		int i = 0;
		while(i < numNums)
		{
			System.out.print("Enter a number: ");
			int num = in.nextInt();
			in.nextLine();
			
			nums.add(num);
			
			i = i + 1;
		}
		
		System.out.println("You entered " + nums + ".");
		
		int pos = 0; // the number of positive nums
		int neg = 0; // the nubmer of negative nums
		
		// count the pos's and neg's
		i = 0;
		while(i < numNums)
		{
			if(nums.get(i) < 0)
			{
				neg = neg + 1;
			}
			if(nums.get(i) > 0)
			{
				pos = pos + 1;
			}
			
			i = i + 1;
		}
		
		System.out.println("There were " + pos + " positive(s) and " + neg + " negative(s).");
		
		
		
		
		
		
		
		
		
		
	}
}
