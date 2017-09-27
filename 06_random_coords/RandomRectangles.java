/* Name: Richard Eisenberg
 * File: RandomRectangles.java
 * Description: draws random rectangles
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;

import java.awt.event.*;

public class RandomRectangles extends GraphicsProgram
{
	// random # generator
	private RandomGenerator gen = new RandomGenerator();

	@Override
	public void run()
	{
		// just turn on the mouse:
		addMouseListeners();
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// create a rect at the mouse with random size
		// gen.nextInt(10, 50) gives a random int between 10 and 50 (incl.)
		GRect rect = new GRect(e.getX(), e.getY(),
				                   gen.nextInt(10, 50), gen.nextInt(10, 50));
		rect.setFilled(true);
		rect.setColor(gen.nextColor()); // and random color
		add(rect);
	}
}
