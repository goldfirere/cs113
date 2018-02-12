/* Name: Richard Eisenberg
 * File: Step7.java
 * Desc: Moves a square wherever you point, centered
 */

import acm.program.*;
import java.awt.event.*;

public class Step7 extends GraphicsProgram
{
	private SquareStep7 sq;
	
	@Override
	public void run()
	{
		sq = new SquareStep7();
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
