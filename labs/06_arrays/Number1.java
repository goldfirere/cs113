/* Name: Richard Eisenberg
 * File: Number1.java
 * Description: prints out numbers the user enters
 */
import java.util.*;

public class Number1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int num = -1; // start at something other than 0 so that the loop begins
		while(num != 0)
		{
			System.out.print("Enter a number: ");
			num = in.nextInt();
			in.nextLine();
			
			nums.add(num);
		}
		
		System.out.print("You entered {");
		
		int i = 0;
		while(i < nums.size() - 1)
		{
			System.out.print(nums.get(i) + ", ");
			
			i = i + 1;
		}

		System.out.println("0}.");
	}
}
