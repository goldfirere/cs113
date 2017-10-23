/* Name: Richard Eisenberg
 * File: Number6.java
 * Desc: tells you which numbers are perfect from a set of numbers
 */
import java.util.*;

public class Number6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers do you have? ");
		int numOfNums = in.nextInt();
		in.nextLine();

		ArrayList<Integer> nums = new ArrayList<Integer>();

		int i = 0;
		while(i < numOfNums)
		{
			System.out.print("Enter a number: ");

			nums.add(in.nextInt());
			in.nextLine();

			i = i + 1;
		}

		System.out.print("You entered {");
		
		i = 0;
		while(i < nums.size() - 1)
		{
			System.out.print(nums.get(i) + ", ");
			
			i = i + 1;
		}
		if(nums.size() > 0)
		{
			System.out.print(nums.get(nums.size() - 1));
		}
		System.out.println("}.");
		
		// the list of perfect numbers
		ArrayList<Integer> perfects = new ArrayList<Integer>();
		i = 0;
		while(i < nums.size())
		{
			if(isPerfect(nums.get(i)))
			{
				perfects.add(nums.get(i));
			}
			
			i = i + 1;
		}
		
		System.out.print("Of those, {");
		i = 0;
		while(i < perfects.size() - 1)
		{
			System.out.print(perfects.get(i) + ", ");
			
			i = i + 1;
		}
		if(perfects.size() > 0)
		{
			System.out.print(perfects.get(perfects.size() - 1));
		}
		System.out.println("} are perfect.");
	}
	
	public static boolean isPerfect(int n)
	{
		int sum = 0;
		int divisor = 1;
		while(divisor < n)
		{
			if(n % divisor == 0)
			{
				sum = sum + divisor;
			}
			
			divisor = divisor + 1;
		}
		
		return (sum == n);
	}
}
