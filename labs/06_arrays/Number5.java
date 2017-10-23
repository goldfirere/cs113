/* Name: Richard Eisenberg
 * File: Number5.java
 * Description: zips two lists
 */
import java.util.*;

public class Number5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers do you have? ");
		int numOfNums = in.nextInt();
		in.nextLine();

		ArrayList<Integer> nums = new ArrayList<Integer>(); // the first list of numbers

		System.out.println("You will now enter the first set:");
		int i = 0;
		while(i < numOfNums)
		{
			System.out.print("Enter a number: ");

			nums.add(in.nextInt());
			in.nextLine();

			i = i + 1;
		}
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>(); // the second list of numbers
		
		System.out.println("You will now enter the second set:");
		i = 0;
		while(i < numOfNums)
		{
			System.out.print("Enter a number: ");

			nums2.add(in.nextInt());
			in.nextLine();

			i = i + 1;
		}

		// print out the first set
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
		System.out.println("} in the first set.");
		
		// print out the second set
		System.out.print("You entered {");		
		i = 0;
		while(i < nums2.size() - 1)
		{
			System.out.print(nums2.get(i) + ", ");
			
			i = i + 1;
		}
		if(nums2.size() > 0)
		{
			System.out.print(nums2.get(nums2.size() - 1));
		}
		System.out.println("} in the second set.");
		
		// now, print the zip:
		System.out.print("The zipped sums are {");		
		i = 0;
		while(i < nums.size() - 1)
		{
			System.out.print((nums.get(i) + nums2.get(i)) + ", ");
			
			i = i + 1;
		}
		if(nums.size() > 0)
		{
			System.out.print(nums.get(nums.size() - 1) + nums2.get(nums2.size() - 1));
		}
		System.out.println("}.");
	}
}
