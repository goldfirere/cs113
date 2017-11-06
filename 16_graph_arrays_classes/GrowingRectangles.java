/* Name: Richard Eisenberg
 * File: GrowingRectangles.java
 * Description: Creates rectangles on a click; grows them on a click too
 */
import acm.program.*;
import acm.graphics.*;
import java.util.*;
import java.awt.event.*;

public class GrowingRectangles extends GraphicsProgram
{
	// set up our collection of rectangles
	private ArrayList<GRect> theRects = new ArrayList<GRect>();
	
	@Override
	public void run()
	{
		// enable the mouse:
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// is this click in any rectangle?
		boolean inRectangle = false; // we start by assuming it isn't...
		
		// now, we look through each rectangle:
		int i = 0;
		while(i < theRects.size())
		{
			// here, the variable tester will represent each rectangle,
			// one after another
			GRect tester = theRects.get(i);
			
			if(tester.contains(e.getX(), e.getY()))
			{
				// we've found a rectangle that we've clicked on!
				
				// grow the rectangle:
				tester.setSize(tester.getWidth() + 5,
							   tester.getHeight() + 5);
				
				// also, record that the click is in a rectangle:
				inRectangle = true;
			}
			
			i = i + 1;
		}
		
		// if the click was not in a rectangle, make one:
		if(!inRectangle)
		{
			GRect newOne = new GRect(e.getX(), e.getY(), 10, 10);
			add(newOne); // add to the screen
			
			theRects.add(newOne); // add to our collection
		}
	}
}
