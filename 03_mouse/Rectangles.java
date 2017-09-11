/* Name: eisenbergr
 * File: Rectangles.java
 * Desc: Draws a rectangle wherever you click
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*; // <-- always need this when using the mouse

public class Rectangles extends GraphicsProgram
{
	// still need run to enable the mouse
	public void run()
	{
		// this line enables mouse input. Every program that uses the
		// mouse must have it
		addMouseListeners();
	}

	// this code gets run whenever the mouse is clicked
	public void mousePressed(MouseEvent e)
	{
		/*
		 * e.getX() and e.getY() are the coordinates that the mouse was
		 * clicked at. We wish to make a rectangle at that point.
		 */
		GRect rect = new GRect(e.getX(), e.getY(), 20, 20);
		add(rect);
	}
}
