/* Name: Richard Eisenberg
 * File: RobinBonanza.java
 * Desc: makes a new Robin wherever the user clicks
 */
import acm.program.*;
import java.awt.event.*;

public class RobinBonanza extends GraphicsProgram
{
	@Override
	public void run()
	{
		addMouseListeners(); // nothing drawn at first, so we just enable the mouse
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// every time the mouse is clicked, make a new Robin:
		RobinObject o = new RobinObject();
		o.setLocation(e.getX(), e.getY());
		add(o);
	}
}
