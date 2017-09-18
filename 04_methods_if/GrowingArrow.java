/* Name: Richard Eisenberg
 * File: GrowingArrow.java
 * Description: an arrow that can grow
 */

import acm.graphics.*;

public class GrowingArrow extends GCompound
{
	private GLine shaft; // the shaft of the arrow
	
	public GrowingArrow()
	{
		shaft = new GLine(-20, 0, 0, 0);
		GLine slash = new GLine(-5, 5, 0, 0);
		GLine backslash = new GLine(-5, -5, 0, 0);
		
		add(shaft);
		add(slash);
		add(backslash);
	}
	
	public void grow()
	{
		// move the start point 4 pixels to the left
		shaft.setStartPoint(shaft.getStartPoint().getX() - 4, 0);
	}
}
