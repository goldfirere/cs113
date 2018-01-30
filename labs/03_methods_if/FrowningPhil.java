/* Name: Richard Eisenberg
 * File: FrowningPhil.java
 * Description: moves Phil around and makes his frown
 */
import acm.program.*;
import java.awt.event.*;

public class FrowningPhil extends GraphicsProgram
{
	private Phil1 phil; // our wonderful phil
	
	@Override
	public void run()
	{
		phil = new Phil1();
		phil.setLocation(100, 105);
		add(phil);
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// make phil frown.
		phil.frown();
	}
}
