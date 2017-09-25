/* Name: Richard Eisenberg
 * File: FallingBallObject.java
 * Desc: a falling ball in a GCompound
 */
import java.awt.*;
import acm.graphics.*;

public class FallingBallObject extends GCompound
{
	private double ySpeed; // the speed we're falling
	
	public FallingBallObject()
	{
		// create the ball, centered at (0, 0):
		GOval ball = new GOval(-5, -5, 10, 10);
		ball.setFilled(true);
		ball.setColor(Color.BLUE);
		add(ball);
		
		ySpeed = 0; // start not moving
	}
	
	// this will be called whenever it is time to update our position
	public void update()
	{
		// increase speed:
		ySpeed = ySpeed + .2;
		
		// move ourselves. Note the use of move(...) without anything before
		// the word move. This usage moves the whole compound object,
		// not just a shape within the compound object.
		move(0, ySpeed);
	}
}
