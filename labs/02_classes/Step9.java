/* Name: Richard Eisenbrg
 * File: Step9.java
 * Desc: A blue circle in the center of the applet
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Step9 extends GraphicsProgram
{
	@Override
	public void run()
	{
		GOval circle = new GOval(90, 90, 20, 20);
		circle.setFilled(true);
		circle.setColor(Color.BLUE);
		add(circle);
	}
}
