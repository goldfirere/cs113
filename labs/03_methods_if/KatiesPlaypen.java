/* Name: Richard Eisenberg
   File: KatiesPlaypenProfessional.java
   Desc: An applet with a cat that chases after the mouse
*/

import acm.program.*;
import java.awt.event.*;

public class KatiesPlaypen extends GraphicsProgram
{
	private Katie katie;
	// the cat that chases the mouse

	@Override
	public void run()
	{
		katie = new Katie();
		katie.setLocation(100, 100);
		add(katie);
		
		addMouseListeners();
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// move the cat in the x-direction
		if(e.getX() < katie.getX())
		{
			// move left
			katie.move(-5, 0);
		}
		else
		{
			// move right
			katie.move(5, 0);
		}
		
		// move the cat in the y-direction
		if(e.getY() < katie.getY())
		{
			// move up
			katie.move(0, -5);
		}
		else
		{
			// move down
			katie.move(0, 5);
		}
		
		// check if cat has mouse:
		if(katie.contains(e.getX(), e.getY()))
		{
			// smile!
			katie.smile();
		}
		else
		{
			katie.frown();
		}
	}
}