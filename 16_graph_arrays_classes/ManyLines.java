/* Name: Richard Eisenberg
 * File: ManyLines.java
 * Desc: Draws a line from the points where the user has clicked to mouse 
 */
import acm.program.*;
import acm.graphics.*;
import java.util.*;
import java.awt.event.*;

public class ManyLines extends GraphicsProgram
{
	// our collection of lines
	private ArrayList<GLine> lines = new ArrayList<GLine>();

	// all we need to do is turn on the mouse
	@Override
	public void run()
	{
		addMouseListeners();
	}

	// whenever the mouse is clicked, we create a new line, and add it
	// both to the screen and our collection
	@Override
	public void mousePressed(MouseEvent e)
	{
		GLine newOne = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(newOne);
		lines.add(newOne);
	}

	// whenever the mouse moves, we want to change the endpoints of
	// all the lines. So, we use a loop!
	@Override
	public void mouseMoved(MouseEvent e)
	{
		for(GLine line : lines)
		{
			line.setEndPoint(e.getX(), e.getY());
		}
	}
}
