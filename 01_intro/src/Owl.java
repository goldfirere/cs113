/* Name: Richard Eisenberg
 * File: Owl.java
 * Desc: A drawing of an owl. But she looks more like a cat.
 */

import java.awt.*;

import acm.graphics.*;
import acm.program.*;

public class Owl extends GraphicsProgram
{
	@Override
	public void run()
	{
		GOval head = new GOval(50, 50, 100, 100);
		add(head);
	
		// NB: The owl's left is our right!
		GLine leftEarVert = new GLine(150, 100, 160, 35);
		add(leftEarVert);
		GLine leftEarHoriz = new GLine(160, 35, 100, 50);
		add(leftEarHoriz);
		
		GLine rightEarVert = new GLine(50, 100, 40, 35);
		add(rightEarVert);
		GLine rightEarHoriz = new GLine(40, 35, 100, 50);
		add(rightEarHoriz);
		
		GOval rightEye = new GOval(65, 70, 30, 30);
		add(rightEye);
		GOval rightPupil = new GOval(70, 75, 20, 20);
		rightPupil.setFillColor(Color.black);
		rightPupil.setFilled(true);
		add(rightPupil);
		
		GOval leftEye = new GOval(105, 70, 30, 30);
		add(leftEye);
		GOval leftPupil = new GOval(110, 75, 20, 20);
		leftPupil.setFillColor(Color.black);
		leftPupil.setFilled(true);
		add(leftPupil);
		
		GLine leftBeak = new GLine(100, 120, 105, 105);
		add(leftBeak);
		GLine rightBeak = new GLine(100, 120, 95, 105);
		add(rightBeak);		
	}
}
