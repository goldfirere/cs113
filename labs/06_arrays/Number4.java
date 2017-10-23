/* Name: Richard Eisenberg
 * File: Number4.java
 * Description: calculates the index of the minimum of numbers
 */
import java.util.*;

public class Number4
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
		
		int minIndex = 0; // index of the minimum element
		i = 1; // we can start checking at 1, because we start with minIndex == 0
		while(i < nums.size())
		{
			if(nums.get(i) < nums.get(minIndex))
			{
				minIndex = i;
			}
			
			i = i + 1;
		}
		
		System.out.println("The minimum element was stored at index " + minIndex + ".");
	}
}
