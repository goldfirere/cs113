/* Name: Richard Eisenberg
 * File: ShowBBObject.java
 * Desc: uses the BouncingBallObject in a GraphicsProgram
 */
import java.awt.event.*;
import acm.program.*;
import acm.util.*;

public class ShowBBObject extends GraphicsProgram
{
	private BouncingBallObject ball; // this is our falling ball
	
	@Override
	public void run()
	{
		// set up the ball:
		ball = new BouncingBallObject(getHeight());
		ball.setLocation(100, 5);
		add(ball);
		
		// start the timer:
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		ball.update(); // just call the ball's update method.
	}
}
