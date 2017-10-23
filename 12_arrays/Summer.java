/* Name: Richard Eisenberg
 * File: Summer.java
 * Description: calculates the sum of numbers
 */
import java.util.*;

public class Summer
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

		int sum = 0; // the growing sum

		i = 0;
		while(i < numOfNums)
		{
			sum = sum + nums.get(i);

			i = i + 1;
		}

		System.out.println("The sum is: " + sum);
	}
}
