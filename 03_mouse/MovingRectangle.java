/* Name: Richard Eisenberg
 * File: MovingRectangle.java
 * Desc: An applet that paints a rectangle where you click
 */

// need this whenever we are listening to the mouse:
import java.awt.event.*;

import acm.program.*;
import acm.graphics.*;

/*
 * This class implements an applet that draws a rectangle with its
 * top-left corner where you last clicked.
 */
public class MovingRectangle extends GraphicsProgram
{
	/*
	 * A field declaration: First, we have the word 'private'. This word
	 * will begin all field declarations. Then, we have the type of
	 * the field. A field's type tells us what sort of information the
	 * field stores. This field will store a rect, so we say that its
	 * type is GRect. Lastly, we give a name to our field. This field's
	 * name is 'rect'. After the field declaration, there always must be
	 * a comment describing the purpose of the field. In this case, the
	 * field stores the rect that's moving about the window.
	 */
	private GRect rect; // the rectangle that is moving around the
                      // window

	/*
	 * in the run method (remember that these chunks of code are called
	 * methods), we need to actually create the rectangle (the field
	 * declaration above only leaves aside space for one) and then put
	 * it on the screen.
	 */
	@Override
	public void run()
	{
		rect = new GRect(100, 100, 20, 30); // make a 20x30 rect at
                                        // (100, 100)
		add(rect); // add it to the screen

		/*
		 * the following line is needed whenever we will be listening to
		 * the mouse
		 */
		addMouseListeners();
	}

	/*
	 * the mousePressed method is run whenever the mouse is clicked
	 * within the program window. For this program, we want it to move
	 * the rect to wherever the mouse was clicked.
	 */
	@Override
	public void mousePressed(MouseEvent e) // can change to mouseMoved
	{
		/*
		 * As we're going to learn, there's a whole bunch of operations
		 * we can perform on graphical elements. We've already seen
		 * setFilled and setColor. Here, we have setLocation. As you
		 * might guess, this operation changes the location of the
		 * element. Similarly to how setColor accepts the new color in
		 * the parentheses, setLocation accepts the new location in the
		 * parentheses. So, rect.setLocation(20, 30) would place the
		 * upper-left corner of the rectangle at (20, 30). Here, we
		 * don't want the rectangle to move to (20, 30); we want it
		 * wherever the mouse clicked. To refer to the x-coordinate of
		 * the mouse click, we say e.getX(). To get the y-coordinate, we
		 * say e.getY(). So, putting it all together,
		 * rect.setLocation(e.getX(), e.getY()) will move the
		 * rectangle's upper-left corner to the location of the mouse
		 * click.
		 */
		rect.setLocation(e.getX(), e.getY());
	}
}
