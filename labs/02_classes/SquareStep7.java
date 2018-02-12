/* Name: Richard Eisenberg
 * File: SquareStep7.java
 * Desc: A square compound object, with the hotspot at the center
 */

import acm.graphics.*;

public class SquareStep7 extends GCompound
{
	public SquareStep7()
	{
		GRect r = new GRect(-10, -10, 20, 20);
		add(r); 
	}
}

// The hotspot of this square is its center, so that the program
// containing this square has the mouse point toward the square's
// center.