/* Name: Richard Eisenberg
   File: Cat.java
   Desc: draws a cat centered at (0, 0).  So, that's not useful.  Sue me!
*/

import acm.program.*;
import acm.graphics.*;

public class Cat extends GraphicsProgram
{
	@Override
	public void run()
	{
		GOval outline = new GOval(-50, -50, 100, 100); // outline
		add(outline);

		GOval nose = new GOval(-5, -5, 10, 10); // nose
		GOval rightNostril = new GOval(-4, -1, 2, 2); // right nostril
		GOval leftNostril = new GOval(2, -1, 2, 2); // left nostril
		add(nose);
		add(rightNostril);
		add(leftNostril);
		
		// eyes:
		GOval rightEye = new GOval(-26, -26, 20, 20); // right
		GOval leftEye = new GOval(6, -26, 20, 20); // left
		add(rightEye);
		add(leftEye);
		
		// pupils:
		GOval rightPupil = new GOval(-19, -23, 6, 14);
		GOval leftPupil = new GOval(13, -23, 6, 14);
		rightPupil.setFilled(true);
		leftPupil.setFilled(true);
		add(rightPupil);
		add(leftPupil);

		// draw normal (frowning) mouth:
		GLine rightFrown = new GLine(-8, 28, 0, 20);
		GLine leftFrown = new GLine(8, 28, 0, 20);
		add(rightFrown);
		add(leftFrown);

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
}