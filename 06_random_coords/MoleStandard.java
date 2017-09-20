/* Name: Richard
 * File: MoleStandard.java
 * Description: Represents a mole that you can whack
 */
import acm.graphics.*;

public class MoleStandard extends GCompound
{
	// this constructor creates the mole
	public MoleStandard()
	{
		// draw the mole:
		GOval face = new GOval(-8, -20, 16, 40);
		add(face);

		GLine rightEye = new GLine(-5, -5, -2, 0);
		add(rightEye);

		GLine leftEye = new GLine(5, -5, 2, 0);
		add(leftEye);

		GOval nose = new GOval(-2, 3, 4, 4);
		add(nose);

		GOval mouth = new GOval(-5, 10, 10, 3);
		mouth.setFilled(true);
		add(mouth);

		GLine whisker1 = new GLine(-2, 12, -7, 22);
		GLine whisker2 = new GLine(-1, 12, -3, 22);
		GLine whisker3 = new GLine(1, 12, 3, 22);
		GLine whisker4 = new GLine(2, 12, 7, 22);

		add(whisker1);
		add(whisker2);
		add(whisker3);
		add(whisker4);
	}
}
