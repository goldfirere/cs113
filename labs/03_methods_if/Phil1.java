/* Name: Richard Eisenberg
 * File: PhilEnterprise.java
 * Description: A compound object for Phil the JavaBot
 */
import acm.graphics.*;

public class Phil1 extends GCompound
{
	// the two halves of Phil's smile:
	private GLine rightSmile;
	private GLine leftSmile;
	
	public Phil1()
	{
		GOval antennaCircle = new GOval(-3, -3, 6, 6);
		GLine antenna = new GLine(0, 3, 0, 10);
		GRect face = new GRect(-10, 10, 20, 20);
		GOval rightEye = new GOval(-7, 12, 4, 4);
		GOval leftEye = new GOval(3, 12, 4, 4);
		rightSmile = new GLine(-5, 20, 0, 25);
		leftSmile = new GLine(5, 20, 0, 25);
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
	
	// move the GLine's of Phil's smile down.
	public void frown()
	{
		rightSmile.setStartPoint(rightSmile.getX(), rightSmile.getY() + 1);
		leftSmile.setStartPoint(leftSmile.getX(), leftSmile.getY() + 1);
	}
}
