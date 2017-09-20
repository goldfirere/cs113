/* Name: Richard
 * File: RandomRectangles.java
 * Description: draws random rectangles
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;

public class RandomRectangles extends GraphicsProgram
{
	private RandomGenerator gen = new RandomGenerator(); // random # generator

	public void run()
	{
		// just turn on the mouse:
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e)
	{
		// create a rect at the mouse with random size
		// gen.nextInt(10, 50) creates a random integer between 10 and 50 (inclusive)
		GRect rect = new GRect(e.getX(), e.getY(), gen.nextInt(10, 50), gen.nextInt(10, 50));
		rect.setFilled(true);
		rect.setColor(gen.nextColor()); // and random color
		add(rect);
	}
}
