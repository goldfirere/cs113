/* Name: Richard Eisenberg
 * File: Number1.java
 * Desc: Greets a person using data from a file
 */

import acm.program.*;
import acm.graphics.*;
import java.io.*;
import java.util.*;

public class Number1 extends GraphicsProgram
{
	@Override
	public void run()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What file should I read? ");
		String filename = in.nextLine();
		
		try(Scanner file = new Scanner(new FileReader(filename)))
		{
			int x = file.nextInt();
			int y = file.nextInt();
			String name = file.next();
			
			GLabel greeting = new GLabel("Hello, " + name, x, y);
			add(greeting);
		}
		catch(FileNotFoundException e)
		{
			GLabel notFound = new GLabel("The requested file was not found.", 10, 100);
			add(notFound);
		}
	}
}
