/* Name: Richard Eisenberg
 * File: LightSwitch.java
 * Desc: Clicking on this app makes it toggle colors
 */

import acm.program.*;
import acm.graphics.*;

import java.awt.*;
import java.awt.event.*;

public class LightSwitch extends GraphicsProgram
{
	private GRect background; // the background rectangle
	
	private boolean lightIsOn; // true <=> the background is white
	
	@Override
	public void run()
	{
		background = new GRect(0, 0, 200, 200);
		background.setFilled(true);
		background.setColor(Color.BLACK);
		add(background);
		
		lightIsOn = false; // light starts off
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// Because lightIsOn is a boolean, it is an appropriate if condition;
		// it's either true or false.
		if(lightIsOn)
		{
			lightIsOn = false; // if the light was on, turn it off
			background.setColor(Color.BLACK);
		}
		else
		{
			lightIsOn = true; // if the light was off, turn it on
			background.setColor(Color.WHITE);
		}
	}
}
