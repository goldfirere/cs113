/* Name: Richard Eisenberg
 * File: Step8.java
 * Desc: Moves a square wherever you point, with a bad hotspot
 */

import acm.program.*;
import java.awt.event.*;

public class Step8 extends GraphicsProgram
{
	private SquareStep8 sq;
	
	@Override
	public void run()
	{
		sq = new SquareStep8();
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
