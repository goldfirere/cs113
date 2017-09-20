/* Name: Richard Eisenberg
 * File: MovingRight.java
 * Desc: an example illustrating Timers
 */

import acm.program.*;
import acm.graphics.*;

// These next two are necessary for Timers
import acm.util.*;
import java.awt.event.*;

public class MovingRight extends GraphicsProgram
{
	private GRect rect; // the rectangle

	@Override
	public void run()
	{
		// create and add the rectangle:
		rect = new GRect(0, 90, 20, 20);
		add(rect);

		// make the timer interval 25 milliseconds
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// move the rectangle to the right
		rect.move(2, 0);
	}
}
