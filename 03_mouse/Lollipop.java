/* Name: Richard Eisenberg
 * File: Lollipop.java
 * Desc: demonstrates the use of getX and getY with shapes to make a Lollipop move
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
import java.awt.*;

public class Lollipop extends GraphicsProgram
{
	private GLine stick; // the stick of the lollipop
	private GOval pop; // the circle at the top of the pop
	
	@Override
	public void run()
	{
		// make lollipop in center:
		stick = new GLine(100, 100, 100, 170);
		pop = new GOval(85, 70, 30, 30);
		
		pop.setFilled(true);
		pop.setColor(Color.RED);
		
		add(stick);
		add(pop);
		
		addMouseListeners(); // enable mouse
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// put the base of the stick at the mouse:
		stick.setLocation(e.getX(), e.getY() - 70);
		
		// then, put the circle on top. its upper-left corner
		// should be 15 to the left of and 30 above the top
		// of the stick:
		pop.setLocation(stick.getX() - 15, stick.getY() - 30);
	}
}
