/* Name: Richard Eisenberg
 * File: ClickCounter.java
 * Desc: counts the number of times the user has clicked
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class ClickCounter extends GraphicsProgram
{
	private int numClicks; // the number of clicks
	private GLabel clickLabel; // where we show the user the # of clicks
	
	@Override
	public void run()
	{
		numClicks = 0; // start at 0
		
		clickLabel = new GLabel("Clicks: " + numClicks, 90, 110);
		add(clickLabel);
		
		// enable the mouse
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// increase the number of clicks
		numClicks = numClicks + 1;
		
		// update the label
		clickLabel.setLabel("Clicks: " + numClicks);
	}
}
