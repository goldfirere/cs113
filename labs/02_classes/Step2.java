/* Name: Richard Eisenberg
 * File: Step2.java
 * Desc: Draws a Robin wherever you click, centered on the left eye
 */

import acm.program.*;
import java.awt.event.*;

public class Step2 extends GraphicsProgram
{
	@Override
	public void run()
	{
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		RobinObject robin = new RobinObject();
		robin.setLocation(e.getX() - 8, e.getY() + 8);
		// The -8 and +8 are calculated by looking at the coordinates
		// of the center of Robin's eye, as defined in RobinObject.java
		add(robin);
	}
}
