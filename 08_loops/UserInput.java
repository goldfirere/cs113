/* Name: Richard Eisenberg
 * File: UserInput.java
 * Description: Demonstrates the use of the Scanner class for user input
 */
import java.util.*; // <-- necessary to use Scanner

public class UserInput
{
	public static void main(String[] args)
	{
		// need this line to set up the Scanner
		Scanner in = new Scanner(System.in);

		// now, we can use the Scanner like this:

		// note print instead of println so that you enter the info on
		// the same line
		System.out.print("Enter your name: ");

		/*
		 * Just as an int or double is a number, a String is a chunk of
		 * text, such as a name. Declare a String variable the same way
		 * you declare an int variable -- first the type (String, in
		 * this case) and then the name of the variable (name, in this
		 * case).
		 */
		// nextLine reads one line from the user
		String name = in.nextLine();

		System.out.print("Enter your age: ");
		double age = in.nextDouble(); // nextDouble reads a number

		// there is also nextInt if you want to read an int

		System.out.println("Hello, " + name + ".  You are " + age
				+ " years old.");
		// use the + to combine strings and other text you wish to print
	}
}
