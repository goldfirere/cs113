/* Name: Richard Eisenberg
 * File: Problem4.java
 * Desc: prints numbers 2 to 20
 */

public class Problem4
{
	public static void main(String[] args)
	{
		int counter = 2; // goes up by 2s
		while(counter <= 20)
		{
			System.out.println(counter);
			counter = counter + 2;
		}
	}
}
