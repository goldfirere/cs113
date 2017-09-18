/* Name: Richard Eisenberg
 * File: Pinocchirobin.java
 * Description: represents a compound Robin object with a growing nose
 */
import acm.graphics.*;

// no import acm.program.*; We need that only for GraphicsPrograms

public class Pinocchirobin extends GCompound
{
	private GLine noseSlant; // upper part of nose
	private GLine noseBase; // bottom of nose
	
	public Pinocchirobin()
	{
		/*
		 * make Robin centered around the point (0, 0) -- you will always
		 * want to center compound objects around (0, 0) for easy
		 * manipulation later.
		 */
		GOval face = new GOval(-25, -25, 50, 50);
		GOval rightEye = new GOval(-13, -13, 10, 10);
		GOval leftEye = new GOval(3, -13, 10, 10);
		GLine mouth = new GLine(-8, 15, 8, 15);
		
		noseSlant = new GLine(0, 0, 10, 10);
		noseBase = new GLine(0, 10, 10, 10);

		add(face);
		add(rightEye);
		add(leftEye);
		add(mouth);
		
		add(noseSlant);
		add(noseBase);
	}
	
	public void growNose()
	{
		noseSlant.setEndPoint(noseSlant.getEndPoint().getX() + 3, 10);
		noseBase.setEndPoint(noseBase.getEndPoint().getX() + 3, 10);
	}
}
