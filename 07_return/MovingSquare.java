/* Name: Richard Eisenberg
 * File: MovingSquare.java
 * Desc: Example of how the keys can move a square around the app
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;

public class MovingSquare extends GraphicsProgram
{
	private GRect square; // our square
	
	@Override
	public void run()
	{
		square = new GRect(90, 90, 20, 20);
		square.setFilled(true);
		square.setColor(Color.BLUE);
		add(square);
		
		addKeyListeners(); // respond to keystrokes
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		// just check each direction one at a time
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			square.move(-5, 0);
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			square.move(0, -5);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			square.move(5, 0);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			square.move(0, 5);
		}
	}
}
