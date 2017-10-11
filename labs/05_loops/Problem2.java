/* Name: Richard Eisenberg
 * File: Problem2.java
 * Desc: prints numbers up to a value the user enters
 */
import java.util.*;

public class Problem2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int userNum = in.nextInt(); // the user-supplied limit
		in.nextLine();
		
		int i = 1; // the counter
		while(i <= userNum)
		{
			System.out.println(i);
			
			i = i + 1;
		}
	}
}
