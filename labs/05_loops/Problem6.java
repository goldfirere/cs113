/* Name: Richard Eisenberg
 * File: Problem6.java
 * Desc: prints triangular numbers up to the number the user enters
 */
import java.util.*;

public class Problem6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int limit = in.nextInt();
		in.nextLine();
		
		int number = 1; // this will be the number printed
		int increment = 2; // this is how much we add each iteration
		
		while(number <= limit)
		{
			System.out.println(number);
			
			number = number + increment; // move number up
			increment = increment + 1; // and increase the increment
		}
	}
}
