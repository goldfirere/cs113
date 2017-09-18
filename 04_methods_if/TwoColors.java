/* Name: Richard Eisenberg
 * File: TwoColors.java
 * Desc: An applet showcasing if statements
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

public class TwoColors extends GraphicsProgram
{
	private GRect background; // the background rectangle
	private GLine separator; // the line separating the colors

	/* create the rectangle and arrange the other elements */
	@Override
	public void run()
	{
		// first, the background:
		background = new GRect(0, 0, 200, 200);
		background.setFilled(true);
		//background.setColor(Color.BLUE);
		add(background);

		// draw the line down the middle:
		separator = new GLine(100, 0, 100, 200);
		add(separator);

		// draw the labels for the sides. they are not perfectly centered
		GLabel blue = new GLabel("Blue", 50, 100);
		GLabel red = new GLabel("Red", 150, 100);
		add(blue);
		add(red);

		addMouseListeners();
	}

	/*
	 * Responds to mouse clicks. The method changes the color of the
	 * background.
	 */
	@Override
	public void mousePressed(MouseEvent e)
	{
		// this tests whether the mouse click was on the right side. So,
		// we need to compare the x-coordinate of the mouse click with the
		// x-coordinate of the center of the separator line.
		if(e.getX() > separator.getX())
		{
			// the mouse was clicked on the right side, so we go to red
			background.setColor(Color.RED);
		}
		else
		{
			// the mouse was not clicked on the right side. that means it
			// was clicked on the left side, so we go to blue.
			background.setColor(Color.BLUE);
		}
	}
}
