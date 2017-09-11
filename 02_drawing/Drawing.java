/* Name: Richard Eisenberg
 * File: Drawing.java
 * Desc: demonstrates many available drawing commands
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Drawing extends GraphicsProgram
{
	/* In the run section of the file, we put all the drawing code: */
	@Override // <-- This means that the method is special. We'll
	          // learn more about this later on.
	          // For now, all methods we write will have @Override.
	public void run()
	{
		/*
		 * make a label. We specify the message to draw, and the
		 * coordinates of the lower-left-most point in the label.
		 */
		GLabel greeting = new GLabel("Hi there!", 10, 10);

		// after creating anything, we need to remember to add it!
		add(greeting);
		/*
		 * make a rectangle. We specify the coordinates of the
		 * upper-left corner and the width & height. This rectangle has
		 * its upper-left corner at (10, 20) and is 40 by 60.
		 */
		GRect rectangle = new GRect(10, 20, 40, 60);
		add(rectangle);

		/*
		 * make an oval. We specify the coordinates of the upper-left
		 * corner of the oval's bounding box (imagine a rectangle snugly
		 * fitting around the oval; the first coordinates are the
		 * upper-left corner of that rectangle) and the oval's width and
		 * height. To draw a circle, we simply draw an oval with width
		 * and height equal to each other. The following oval has an
		 * upper-left corner at (10, 100), a width of 50 and a height of
		 * 50, making it a circle.
		 */
		GOval circle = new GOval(10, 100, 50, 50);
		add(circle);

		/*
		 * make a line segment between two points. We specify the
		 * coordinates of the first point and then the coordinates of
		 * the second point. The following line runs from (60, 20) to
		 * (100, 100).
		 */
		GLine line = new GLine(60, 20, 100, 100);
		add(line);

		/*
		 * make a filled rectangle. This rectangle appears directly to
		 * the right of the first, with the same width and height. Note
		 * that only the first number has changed.
		 */
		GRect filledRectangle = new GRect(150, 20, 40, 60);

		// now, we turn its filling on. If we don't do this, it won't be
		// filled
		filledRectangle.setFilled(true);

		/*
		 * change the rectangle color to blue. Possible colors are
		 * BLACK, BLUE, CYAN, GRAY, DARK_GRAY, LIGHT_GRAY, GREEN,
		 * MAGENTA, ORANGE, PINK, RED, WHITE, and YELLOW. All color
		 * names must always be preceded by Color. So, to use RED, we
		 * need Color.RED. Also, for any color operation, you must
		 * import java.awt.*; at the top of your file.
		 */
		filledRectangle.setFillColor(Color.BLUE);

		// finally, add the filled rectangle
		add(filledRectangle);
	}
}