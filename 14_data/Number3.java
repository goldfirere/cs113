/* Name: Richard Eisenberg
 * File: Number3.java
 * Description: calculates the mean of numbers
 */
import java.util.*;

public class Number3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers do you have? ");
		int numOfNums = in.nextInt();
		in.nextLine();

		int[] nums = new int[numOfNums];

		int i = 0;
		while(i < numOfNums)
		{
			System.out.print("Enter a number: ");

			nums[i] = in.nextInt();
			in.nextLine();

			i = i + 1;
		}
		
		System.out.print("You entered {");
		
		i = 0;
		while(i < nums.length - 1)
		{
			System.out.print(nums[i] + ", ");
			
			i = i + 1;
		}
		if(nums.length > 0)
		{
			System.out.print(nums[nums.length - 1]);
		}
		System.out.println("}.");

		int sum = 0; // the growing sum

		i = 0;
		while(i < numOfNums)
		{
			sum = sum + nums[i];

			i = i + 1;
		}

		System.out.println("The average is: " + sum / numOfNums);
	}
}
