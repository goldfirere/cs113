/* Name: Richard
 * File: GrowingMovingRectangle.java
 * Description: A rectangle that grows and moves every time you click
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class GrowingMovingRectangle extends GraphicsProgram
{
	private GRect rect; // the rect that is growing & moving
	
	@Override
	public void run()
	{
		rect = new GRect(5, 5, 5, 5); // start in upper-left corner
		rect.setFilled(true);
		add(rect);
		
		addMouseListeners(); // turn on the mouse
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// grow:
		rect.setSize(rect.getWidth() + 5, rect.getHeight() + 5);
		
		// move:
		rect.move(5, 5);
		
		// No mention of 'e' anywhere here -- that's because we don't
		// care where the mouse was clicked.
	}
}
