/* Name: Richard Eisenberg
 * File: TracingPaper.java
 * Description: The tracing paper that moves around
 */
import acm.graphics.*;

public class TracingPaper extends GCompound
{
	private GRect rect; // a rect you can move
	
	public TracingPaper()
	{		
		rect = new GRect(0, 0, 50, 50);
		add(rect);
	}
	
	// moves the rect. should it move with rect.setLocation or just
	// setLocation?
	public void moveTheRect()
	{
		rect.setLocation(5, 0);
	}
}
