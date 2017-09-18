/* Name: Richard Eisenberg
 * File: MovingGrowingArrow.java
 * Description: an arrow that moves & grows
 */

import acm.program.*;
import java.awt.event.*;

public class MovingGrowingArrow extends GraphicsProgram
{
	private GrowingArrow arrow; // our arrow
	
	@Override
	public void run()
	{
		arrow = new GrowingArrow();
		arrow.setLocation(-100, -100); // start offscreen
		add(arrow);
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		arrow.grow();
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		arrow.setLocation(e.getX(), e.getY());
	}
}
