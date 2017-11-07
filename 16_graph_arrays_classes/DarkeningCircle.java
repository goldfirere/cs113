/* Name: Richard Eisenberg
 * File: DarkeningCircle.java
 * Desc: A circle that can get darker
 */

import acm.graphics.*;
import java.awt.*;

public class DarkeningCircle extends GCompound
{
	private GOval circ;
	private int grayLevel;
	
	public DarkeningCircle(int x, int y)
	{
		circ = new GOval(-5, -5, 10, 10);
		circ.setFilled(true);
		circ.setColor(Color.WHITE);
		add(circ);
		setLocation(x, y);
		
		grayLevel = 255;
	}
	
	public void darken()
	{
		grayLevel = grayLevel - 1;
		if(grayLevel >= 0)
		{
			Color gray = new Color(grayLevel, grayLevel, grayLevel);
			circ.setColor(gray);
		}
	}
	
	public void whiten()
	{
		grayLevel = 255;
		circ.setColor(Color.WHITE);
	}
}
