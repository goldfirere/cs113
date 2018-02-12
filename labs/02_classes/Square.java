/* Name: Richard Eisenberg
 * File: Square.java
 * Desc: A square compound object
 */

import acm.graphics.*;

public class Square extends GCompound
{
	public Square()
	{
		GRect r = new GRect(0, 0, 20, 20);
		add(r); 
	}
}

// The hotspot of this square is its upper-left corner.