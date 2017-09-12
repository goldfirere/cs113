/* Name: Richard Eisenberg
   File: CenteredCircle.java
   Desc: Draws circles centered at a mouse click
*/

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class CenteredCircle extends GraphicsProgram
{
	// create the oval and add it to the screen:
	@Override
	public void run()
	{
		addMouseListeners();
	}

	// when the mouse clicks, set the new location of the circle:
	@Override
	public void mousePressed(MouseEvent e)
	{
		/*
		 * The circle has a diameter of 20. If we want the center to
		 * be at e.getX(), we need the left side to be at e.getX() -
		 * 10. Same for the y coordinate.
		 */
		GOval circle = new GOval(e.getX() - 10, e.getY() - 10, 20, 20);
		add(circle);
	}
}