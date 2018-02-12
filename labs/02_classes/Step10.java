/* Name: Richard Eisenbrg
 * File: Step10.java
 * Desc: A pink circle in the center of the applet
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Step10 extends GraphicsProgram
{
	@Override
	public void run()
	{
		GOval circle = new GOval(90, 90, 20, 20);
		circle.setFilled(true);
		circle.setColor(new Color(255, 128, 128));
		add(circle);
	}
}
