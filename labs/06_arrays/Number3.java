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

		int sum = 0; // the growing sum

		i = 0;
		while(i < numOfNums)
		{
			sum = sum + nums.get(i);

			i = i + 1;
		}

		System.out.println("The average is: " + sum / numOfNums);
	}
}
