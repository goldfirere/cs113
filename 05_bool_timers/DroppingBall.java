/* Name: Richard Eisenberg
 * File: DroppingBall.java
 * Description: A ball that drops and stops
 */
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;
import java.awt.*;

public class DroppingBall extends GraphicsProgram
{
	private GOval ball; // the dropping ball
	
	@Override
	public void run()
	{
		// start offscreen:
		ball = new GOval(90, -20, 20, 20);
		ball.setColor(Color.RED);
		ball.setFilled(true);
		add(ball);
		
		// start timer, with interval of 25 ms
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// as long as the ball is high enough, move it down
		if(ball.getY() + ball.getHeight() < 200)
		{
			ball.move(0, 2);
		}
	}
}
