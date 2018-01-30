/* Name: Richard Eisenberg
   File: Katie.java
   Desc: models a cat that can smile
*/

import acm.graphics.*;

public class Katie extends GCompound
{	
	private GLine leftMouth; // these lines are the two parts of Katie's mouth
	private GLine rightMouth;
	
	public Katie()
	{
		GOval outline = new GOval(-50, -50, 100, 100); // outline
		add(outline);

		GOval nose = new GOval(-5, -5, 10, 10); // nose
		GOval rightNostril = new GOval(-3 - 1, -1, 2, 2); // right nostril
		GOval leftNostril = new GOval(3 - 1, -1, 2, 2); // left nostril
		add(nose);
		add(rightNostril);
		add(leftNostril);
		
		// eyes:
		GOval rightEye = new GOval(-16 - 10, -16 - 10, 20, 20); // right
		GOval leftEye = new GOval(16 - 10, -16 - 10, 20, 20); // left
		add(rightEye);
		add(leftEye);
		
		// pupils:
		GOval rightPupil = new GOval(-16 - 3, -16 - 7, 6, 14);
		GOval leftPupil = new GOval(16 - 3, -16 - 7, 6, 14);
		rightPupil.setFilled(true);
		leftPupil.setFilled(true);
		add(rightPupil);
		add(leftPupil);
				
		// draw normal mouth:
		rightMouth = new GLine(-8, 20 + 8, 0, 20);
		leftMouth = new GLine(8, 20 + 8, 0, 20);
		add(rightMouth);
		add(leftMouth);

		// whiskers:
		GLine topRightWhisker = new GLine(-20, 0, -3, 7);
		GLine bottomRightWhisker = new GLine(-20, 14, -3, 9);
		GLine topLeftWhisker = new GLine(20, 0, 3, 7);
		GLine bottomLeftWhisker = new GLine(20, 14, 3, 9);
		add(topRightWhisker);
		add(bottomRightWhisker);
		add(topLeftWhisker);
		add(bottomLeftWhisker);

		// right ear:
		GLine rightEarUp = new GLine(-24, -44, -19, -60);
		GLine rightEarDown = new GLine(-19, -60, -14, -47);
		add(rightEarUp);
		add(rightEarDown);

		// left ear:
		GLine leftEarUp = new GLine(24, -44, 19, -60);
		GLine leftEarDown = new GLine(19, -60, 14, -47);
		add(leftEarUp);
		add(leftEarDown);
	}

	public void smile() // makes Katie smile
	{
		rightMouth.setStartPoint(-8, 20);
		rightMouth.setEndPoint(0, 28);
		leftMouth.setStartPoint(0, 28);
		leftMouth.setEndPoint(8, 20);
	}
	
	public void frown() // makes Katie frown
	{
		rightMouth.setStartPoint(-8, 28);
		rightMouth.setEndPoint(0, 20);
		leftMouth.setStartPoint(0, 20);
		leftMouth.setEndPoint(8, 28);
	}
}