/* Name: Richard Eisenberg
 * File: Slingshot.java
 * Desc: a basic example of a slingshot using a compound object to represent the shot
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import acm.util.*;

public class SlingshotAppProfessional extends GraphicsProgram
{	
	private Slingshot shot; // the rising and falling shot
	
	// controls for x and y velocities
	private NumberControl xControl;
	private NumberControl yControl;
	
	// label for firing
	private GLabel fire;
	
	@Override
	public void run()
	{
		// create shot:
		shot = new Slingshot();
		add(shot);
		
		xControl = new NumberControl();
		xControl.setLocation(15, 10);
		add(xControl);
		
		yControl = new NumberControl();
		yControl.setLocation(15, 20);
		add(yControl);
		
		xControl.setRange(0, 10);
		yControl.setRange(0, 10);
		
		xControl.setNumber(1.5);
		yControl.setNumber(5);
		
		GLabel x = new GLabel("x: ", 5, 10);
		GLabel y = new GLabel("y: ", 5, 20);
		
		add(x);
		add(y);
		
		fire = new GLabel("Fire!", 5, 35);
		add(fire);
		
		// enable mouse and timer
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		xControl.click(e.getX(), e.getY());
		yControl.click(e.getX(), e.getY());
		
		// fire when ready
		if(fire.contains(e.getX(), e.getY()))
		{
			shot.fire(xControl.getNumber(), yControl.getNumber());
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		shot.update(); // the shot keeps track of whether it's moving or not
	}
}
