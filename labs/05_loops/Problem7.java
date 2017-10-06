/* Name: eisenbergr
 * File: Problem7.java
 * Desc: prints Fibonacci numbers up to a user-supplied limit
 */
import java.util.*;

public class Problem7
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int limit = in.nextInt();
		in.nextLine();
		
		int first = 0; // the "oldest" Fib number
		int second = 1; // the next Fib number
		int sum = first + second; // the sum of the previous two
		
		while(first <= limit)
		{
			System.out.println(first);
			
			// move along in the Fibonacci sequence
			first = second;
			second = sum;
			sum = first + second;
		}
	}
}
