/* Name: Richard Eisenberg
 * File: Step1.java
 * Desc: Draws a Robin wherever you click
 */

import acm.program.*;
import java.awt.event.*;

public class Step1 extends GraphicsProgram
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
		robin.setLocation(e.getX(), e.getY());
		add(robin);
	}
}
