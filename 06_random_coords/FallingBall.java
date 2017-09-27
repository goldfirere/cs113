/* Name: Richard Eisenberg
 * File: FallingBall.java
 * Desc: a ball that falls at ever-increasing speed 
 */
import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class FallingBall extends GraphicsProgram
{
	private double ySpeed; // the speed at which the ball is falling
	private GOval ball; // the figure of the ball
	
	@Override
	public void run()
	{
		// create the ball at the top of the screen:
		ball = new GOval(95, 0, 10, 10);
		ball.setFilled(true);
		ball.setColor(Color.BLUE);
		add(ball);
		
		// set the initial speed to 0
		ySpeed = 0;
		
		// start the timer:
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// increase the speed by a little:
		ySpeed = ySpeed + .1;
		
		// move the ball down:
		ball.move(0, ySpeed);
	}
}
