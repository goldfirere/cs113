/* Name: Richard Eisenberg
 * File: Step6.java
 * Desc: Moves a square wherever you point, centered on the top left
 */

import acm.program.*;
import java.awt.event.*;

public class Step6 extends GraphicsProgram
{
	private Square sq;
	
	@Override
	public void run()
	{
		sq = new Square();
		sq.setLocation(100, 100);
		add(sq);
		
		addMouseListeners();
	}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		sq.setLocation(e.getX(), e.getY());
	}
}
