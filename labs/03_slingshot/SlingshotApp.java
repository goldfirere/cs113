/* Name: Richard Eisenberg
 * File: SlingshotApp.java
 * Desc: a slingshot using a compound object with parameters
 */
import acm.program.*;
import java.awt.event.*;
import acm.util.*;

public class SlingshotApp extends GraphicsProgram
{
	private Slingshot shot; // the rising and falling shot
	
	@Override
	public void run()
	{
		// create shot:
		shot = new Slingshot();
		add(shot);
		
		// enable mouse and timer
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// fire the shot (this will do nothing if the shot is in motion)
		shot.fire(1.5, 5);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// just make the shot move along
		shot.update();
	}
}
