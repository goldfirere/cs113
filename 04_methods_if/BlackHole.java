/* Name: Richard Eisenberg
 * File: BlackHole.java
 * Description: a growing and shrinking black hole
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class BlackHole extends GraphicsProgram
{
	private GOval hole; // the black circle
	
	@Override
	public void run()
	{
		// start it in the center
		hole = new GOval(90, 90, 20, 20);
		hole.setFilled(true);
		add(hole);
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		if(hole.contains(e.getX(), e.getY()))
		{
			// if we've clicked on it
			hole.setSize(hole.getWidth() + 5, hole.getHeight() + 5);
			hole.move(-2.5, -2.5); // need to do this to keep it properly centered
		}
		else
		{
			// if we clicked off it
			hole.setSize(hole.getWidth() - 5, hole.getHeight() - 5);
			hole.move(2.5, 2.5);
		}
	}
}
