/* Name: Richard Eisenberg
 * File: Robot.java
 * Desc: Draws a robot with its antenna centered at (0, 0)
 */

import acm.graphics.*;
import acm.program.*;

public class Robot extends GraphicsProgram
{
	@Override
	public void run()
	{
		GOval antennaCircle = new GOval(-3, -3, 6, 6);
		GLine antenna = new GLine(0, 3, 0, 10);
		GRect face = new GRect(-10, 10, 20, 20);
		GOval rightEye = new GOval(-7, 12, 4, 4);
		GOval leftEye = new GOval(3, 12, 4, 4);
		GLine rightSmile = new GLine(-5, 20, 0, 25);
		GLine leftSmile = new GLine(5, 20, 0, 25);
		GRect body = new GRect(-20, 30, 40, 50);
		GLine rightArm = new GLine(-20, 45, -30, 40);
		GLine leftArm = new GLine(20, 45, 30, 40);
		GLine rightLeg = new GLine(-10, 80, -10, 95);
		GLine leftLeg = new GLine(10, 80, 10, 95);
		
		add(antennaCircle);
		add(antenna);
		add(face);
		add(rightEye);
		add(leftEye);
		add(rightSmile);
		add(leftSmile);
		add(body);
		add(rightArm);
		add(leftArm);
		add(rightLeg);
		add(leftLeg);
	}
}
