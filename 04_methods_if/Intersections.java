/* Name: Richard
 * File: Intersections.java
 * Desc: Demonstrates the contains and intersects commands
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;

// Both shapes are normally black.  When the mouse is over the square,
// it becomes blue.  When the square and circle touch, the circle
// becomes red.  Clicking moves the circle.
public class Intersections extends GraphicsProgram
{
	private GRect square; // the square in the center
	private GOval circ; // the circle that moves when you click
	
	@Override
	public void run()
	{
		// create the shapes:
		square = new GRect(90, 90, 20, 20);
		add(square);
		square.setFilled(true);
		
		circ = new GOval(0, 0, 20, 20);
		add(circ);
		circ.setFilled(true);
		
		// enable the mouse:
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// first, move the circle:
		circ.setLocation(e.getX() - 10, e.getY() - 10);
		
		// then, check if the circle & square overlap:
		// we have to use all this code with getBounds & intersects
		if(circ.getBounds().intersects(square.getBounds()))
		{
			circ.setColor(Color.RED);
		}
		else
		{
			// reset color when not overlapping:
			circ.setColor(Color.BLACK);
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		// just check if we're over the square:
		if(square.contains(e.getX(), e.getY()))
		{
			square.setColor(Color.BLUE);
		}
		else
		{
			// if we're not, reset color:
			square.setColor(Color.BLACK);
		}
	}
}
