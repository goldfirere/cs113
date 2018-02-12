/* Name: Richard Eisenberg
 * File: Step4.java
 * Desc: Moves Robin wherever you point, centered on the left eye
 */

import acm.program.*;
import java.awt.event.*;

public class Step4 extends GraphicsProgram
{
	private RobinObject robin;
	
	@Override
	public void run()
	{
		robin = new RobinObject();
		robin.setLocation(100, 100);
		add(robin);
		
		addMouseListeners();
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		robin.setLocation(e.getX() - 8, e.getY() + 8);
		// The -8 and +8 are calculated by looking at the coordinates
		// of the center of Robin's eye, as defined in RobinObject.java
	}
}
