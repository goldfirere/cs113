/* Name: Richard Eisenberg
 * File: PhilBody.java
 * Description: Phil's body -- used in Enterprise
 */
import acm.graphics.*;

public class PhilBody extends GCompound
{
	public PhilBody()
	{
		GRect face = new GRect(-10, 0, 20, 20);
		GOval rightEye = new GOval(-7, 2, 4, 4);
		GOval leftEye = new GOval(3, 2, 4, 4);
		GLine rightSmile = new GLine(-5, 10, 0, 15);
		GLine leftSmile = new GLine(5, 10, 0, 15);
		GRect body = new GRect(-20, 20, 40, 50);
		GLine rightArm = new GLine(-20, 35, -30, 30);
		GLine leftArm = new GLine(20, 35, 30, 30);
		GLine rightLeg = new GLine(-10, 70, -10, 85);
		GLine leftLeg = new GLine(10, 70, 10, 85);
		
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
