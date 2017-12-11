

import java.awt.event.*;
import java.io.*;
import acm.program.*;

public class Writing extends GraphicsProgram
{
	@Override
	public void run()
	{
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent ex)
	{
		try
		{
			PrintWriter w = new PrintWriter(new FileWriter("blah.txt", true));
			w.println("hello!");
			System.out.println("hi there");
			w.flush();
			w.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
