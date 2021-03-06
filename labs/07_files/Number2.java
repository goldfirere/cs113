/* Name: Richard Eisenberg
 * File: Number2.java
 * Desc: Reads in information about 3 rectangles and draws them.
 */

import java.awt.*;
import java.io.*;
import java.util.*;

import acm.graphics.*;
import acm.program.*;

public class Number2 extends GraphicsProgram
{
	@Override
	public void run()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What file should I read? ");
		String filename = in.nextLine();
		
		try(Scanner file = new Scanner(new FileReader(filename)))
		{
			int rectNumber = 0;
			while(rectNumber < 3)
			{
				int x = file.nextInt();
				int y = file.nextInt();
				int w = file.nextInt();
				int h = file.nextInt();
				int r = file.nextInt();
				int g = file.nextInt();
				int b = file.nextInt();
				
				GRect rect = new GRect(x, y, w, h);
				Color c = new Color(r, g, b);
				rect.setColor(c);
				rect.setFilled(true);
				add(rect);
				
				rectNumber = rectNumber + 1;
			}
		}
		catch(FileNotFoundException e)
		{
			GLabel errLabel = new GLabel("File not found.", 10, 100);
			add(errLabel);
		}
	}
}
