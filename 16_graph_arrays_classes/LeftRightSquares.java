/* Name: Richard Eisenberg
 * File: LeftRightSquares.java
 * Description: Draws a bunch of rectangles that dance left and right
 */
import acm.program.*;
import acm.graphics.*;
import java.util.*;
import java.awt.event.*;

public class LeftRightSquares extends GraphicsProgram
{
	// this line sets up our ArrayList of GRects.
	private ArrayList<GRect> theRects = new ArrayList<GRect>();
	
	@Override
	public void run()
	{
		// in run, just add the mouse and key listeners:
		addMouseListeners();
		addKeyListeners();
	}
	
	// when the mouse is clicked, add a rectangle
	@Override
	public void mousePressed(MouseEvent e)
	{
		GRect anotherRect = new GRect(e.getX(), e.getY(), 10, 10);
		add(anotherRect); // add the GRect to the screen
		
		theRects.add(anotherRect); // and, add the rect to our collection
	}
	
	// when left and right are pressed, move all the rects
	@Override
	public void keyPressed(KeyEvent e)
	{
		/*
		 * to do some operation to all objects in an ArrayList, we must
		 * use a loop. Here, we want to use the rect variable to
		 * represent each item in the collection, one after another. For
		 * each item, we want to move that item (that rectangle) either
		 * left or right.
		 */
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			int i = 0;
			while(i < theRects.size())
			{
				GRect rect = theRects.get(i);

				// the action this loop takes is to move a rect left
			  rect.move(-3, 0);
			  
			  i = i + 1;
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			// use another loop
			int i = 0;
			while(i < theRects.size())
			{
				GRect rect = theRects.get(i);
				rect.move(3, 0);
				
				i = i + 1;
			}
		}
	}
}
