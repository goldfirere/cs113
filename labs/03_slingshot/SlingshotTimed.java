/* Name: Richard Eisenberg
 * File: SlingshotTimed.java
 * Desc: a slingshot that goes farther the longer you click
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import acm.util.*;

public class SlingshotTimed extends GraphicsProgram
{
	private Slingshot shot; // the rising and falling shot
	
	private double time; // the number of milliseconds betw/ click & release
	private boolean mouseDown; // is the mouse button currently depressed?
	private GLabel timerLabel; // shows the number of milliseconds
	
	 // counter to 25 so that the shot is updated only every 25ms
	private int counterTo25;
	
	@Override
	public void run()
	{
		// create shot:
		shot = new Slingshot();
		add(shot);
		
		// create timer label
		timerLabel = new GLabel("", 5, 10);
		add(timerLabel);
		
		mouseDown = false;
		
		// enable mouse and timer
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(1, this);
		t.start();
	}
	
	@Override
	public void mouseReleased(MouseEvent e)
	{
		shot.fire(1.5 * (time / 1000), 5 * (time / 1000));
		mouseDown = false; // no longer holding mouse
		
		timerLabel.setLabel("Number of milliseconds: " + time);
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// note that we're holding the mouse and reset the timer
		mouseDown = true;
		time = 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// maybe update the shot
		counterTo25 = counterTo25 + 1;
		if(counterTo25 == 25)
		{
			counterTo25 = 0;
			
			shot.update();
		}
		
		// if we're holding the mouse, count the time
		if(mouseDown == true)
		{
			time = time + 1;
		}
	}
}
