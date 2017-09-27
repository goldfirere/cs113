/* Name: Richard Eisenberg
   File: Colors2.java
   Desc: Changes colors based on keystrokes
*/

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

/* This applet starts out blue.  It turns blue when you press the left arrow
and turns red when you press the right arrow */
public class Colors2 extends GraphicsProgram
{
	private GRect background; // the background rectangle

	@Override
	public void run()
	{
		background = new GRect(0, 0, 200, 200);
		background.setFilled(true);
		add(background);
		
		addKeyListeners(); // we're responding to keys, so addKeyListeners()
	}
	
	/* handles keystrokes */
	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			// turn blue if we have pressed left
			background.setFillColor(Color.BLUE);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			// turn red if we have pressed right
			background.setFillColor(Color.RED);
		}
	}

	/* There also exists a method named keyReleased, which gets called
	 * whenever the user releases a key.  It has the exact same structure
	 * as keyPressed. */
}
