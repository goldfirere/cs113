/* Name: Richard Eisenberg
 * File: Clock.java
 * Description: a digital timer
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;

public class Clock extends GraphicsProgram
{
	private int seconds; // the # of seconds
	private int minutes; // the # of minutes
	
	private GLabel timer; // the label showing the time
	
	@Override
	public void run()
	{
		// start with 0:00
		seconds = 0;
		minutes = 0;
		
		// create label
		timer = new GLabel(minutes + ":" + seconds, 90, 110);
		add(timer);
		
		// start timer counting:
		SwingTimer t = new SwingTimer(1000, this); // interval of 1 sec 
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// this is called every second... update the seconds counter!
		seconds = seconds + 1;
		
		// if we get to 60, count one minute:
		if(seconds == 60)
		{
			minutes = minutes + 1;
			
			// reset seconds:
			seconds = 0;
		}
		
		// update label:
		timer.setLabel(minutes + ":" + seconds);
	}
}
