/* Name: Richard Eisenberg
 * File: SayMyName.java
 * Description: Say my name!  or you're wrong
 */

import java.util.*;

public class SayMyName
{
	public static void main(String[] args)
	{
		System.out.print("Say my name: ");

		Scanner in = new Scanner(System.in);

		String maybeName = in.nextLine(); // get line from user

		// is it my name?
		if(maybeName.equals("Eisenberg"))
		{
			System.out.println("Yuppers.");
		}
		else
		{
			System.out.println("Wrong!");
		}
	}
}
