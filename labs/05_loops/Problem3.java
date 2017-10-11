/* Name: Richard Eisenberg
 * File: Problem3.java
 * Desc: counts down from a number the user enters
 */
import java.util.*;

public class Problem3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int counter = in.nextInt(); // start the counter at the value the user enters
		in.nextLine();
		
		while(counter > 0) // use > to avoid printing 0
		{
			System.out.println(counter);
			
			counter = counter - 1;
		}
	}
}
