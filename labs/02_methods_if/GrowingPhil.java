/* Name: Richard Eisenberg
 * File: GrowingPhil.java
 * Description: Phil that grows when you click
 */
import acm.program.*;
import java.awt.event.*;

public class GrowingPhil extends GraphicsProgram
{
	private Phil2 phil; // our growing robot
	
	@Override
	public void run()
	{
		phil = new Phil2();
		phil.setLocation(-100, -100);
		add(phil);
		
		addMouseListeners();
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		// move phil to the mouse
		phil.setLocation(e.getX(), e.getY());
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// make phil grow
		phil.grow();
	}
}
