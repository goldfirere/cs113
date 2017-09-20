/* Name: Richard Eisenberg
 * File: BlinkingLight.java
 * Description: A red blinking traffic light
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import acm.util.*;
import java.awt.*;

public class BlinkingLight extends GraphicsProgram
{
	private GOval redLight; // the red light that blinks (changes color)
	private boolean lightOn; // true when the light is on; false otherwise
	
	@Override
	public void run()
	{
		// create the traffic light:
		
		GRect outline = new GRect(85, 60, 30, 80);
		outline.setFilled(true);
		add(outline);
		
		redLight = new GOval(90, 65, 20, 20);
		redLight.setFilled(true);
		redLight.setColor(Color.WHITE);
		add(redLight);
		
		GOval yellowLight = new GOval(90, 90, 20, 20);
		yellowLight.setFilled(true);
		yellowLight.setColor(Color.WHITE);
		add(yellowLight);
		
		GOval greenLight = new GOval(90, 115, 20, 20);
		greenLight.setFilled(true);
		greenLight.setColor(Color.WHITE);
		add(greenLight);
		
		// start with light off
		lightOn = false;
		
		// turn on timer:
		SwingTimer t = new SwingTimer(1000, this);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// if the light is on, turn it off, and vice versa:
		if(lightOn == true)
		{
			redLight.setColor(Color.WHITE);
			lightOn = false;
		}
		else
		{
			redLight.setColor(Color.RED);
			lightOn = true;
		}
	}
}
