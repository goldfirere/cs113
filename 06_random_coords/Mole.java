/* Name: Richard
 * File: Mole.java
 * Description: Draws a Mole to the screen
 */
import acm.program.*;
import acm.graphics.*;

public class Mole extends GraphicsProgram
{
	public void run()
	{
		// draw the mole:
		GOval face = new GOval(92, 80, 16, 40);
		add(face);

		GLine rightEye = new GLine(95, 95, 98, 100);
		add(rightEye);

		GLine leftEye = new GLine(105, 95, 102, 100);
		add(leftEye);

		GOval nose = new GOval(98, 103, 4, 4);
		add(nose);

		GOval mouth = new GOval(95, 110, 10, 3);
		mouth.setFilled(true);
		add(mouth);

		GLine whisker1 = new GLine(98, 112, 93, 122);
		GLine whisker2 = new GLine(99, 112, 97, 122);
		GLine whisker3 = new GLine(101, 112, 103, 122);
		GLine whisker4 = new GLine(102, 112, 107, 122);

		add(whisker1);
		add(whisker2);
		add(whisker3);
		add(whisker4);
	}
}
