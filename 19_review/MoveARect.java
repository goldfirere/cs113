/* Name: Richard Eisenberg
 * File: MoveARect.java
 * Desc: Creates rectangles where you click, and moves ones you click on
 */

import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import java.util.*;

public class MoveARect extends GraphicsProgram
{
	private ArrayList<GRect> rects;  // all the rects
	private GRect selectedRect;      // the rect that is selected
	
	@Override
	public void run()
	{
		rects = new ArrayList<GRect>();
		selectedRect = null; // no rectangle is selected at first
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		if(selectedRect != null) // if a rect is selected, drop it
		{
			selectedRect = null; // it's already in the right place
		}
		else
		{
			boolean clickedRect = false; // did we click on a rectangle?
			
			for(GRect r : rects)
			{
				if(r.contains(e.getX(), e.getY()))
				{
					// select it
					selectedRect = r;
					clickedRect = true;
				}
			}
			
			// if we haven't clicked on a rect, create one
			if(!clickedRect)
			{
				GRect r = new GRect(e.getX(), e.getY(), 10, 10);
				add(r);
				rects.add(r);
			}
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		// if we have a selected rect, move it to the mouse
		if(selectedRect != null)
		{
			selectedRect.setLocation(e.getX(), e.getY());
		}
	}
}
