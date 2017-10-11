/* Name: Richard Eisenberg
 * File: Problem5.java
 * Desc: prints odd numbers up to a value the user enters
 */
import java.util.*;

public class Problem5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int limit = in.nextInt(); // the user-supplied limit
		in.nextLine();
		
		int i = 1; // the counter
		while(i <= limit)
		{
			System.out.println(i);
			
			i = i + 2;
		}
	}
}
