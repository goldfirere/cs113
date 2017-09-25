/* Name: Richard Eisenberg
 * File: RandomNumbers.java
 * Desc: every time you click, shows a new random number in a new label
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import acm.util.*;

public class RandomNumbers extends GraphicsProgram
{
	// where we get our random numbers
	private RandomGenerator gen = new RandomGenerator();
	
	@Override
	public void run()
	{
		// just enable the mouse
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// make a new random number from 1 to 100:
		int randy = gen.nextInt(1, 100);
		
		// make a label displaying that number
		GLabel label = new GLabel("" + randy, e.getX(), e.getY());
		// the empty double-quotes in ("" + randy) are to convert the number
		// randy into text that can be shown in a GLabel
		
		add(label);
	}	
}
