/* Name: Richard Eisenberg
 * File: FiveStar.java
 * Desc: Prints 5 stars using a while loop
 */

public class FiveStar
{
	public static void main(String[] args)
	{
		// first, we will need an int variable to count how many stars we
		// have printed
		int numStars = 0; // we haven't printed any stars yet

		// as long as this number is less than 5, we need to keep
		// printing stars:
		while(numStars < 5)
		{
			// print a star:
			System.out.println("*");

			/*
			 * Note the use of print here instead of println. print does
			 * not move the cursor to the next line, so all these stars
			 * will be on one line.
			 */

			// always remember to increment the counter!
			numStars = numStars + 1;
		}
	}
}