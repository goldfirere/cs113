/* Name: Richard Eisenberg
 * File: Slingshot.java
 * Desc: slingshot compound object
 */
import acm.graphics.*;

public class Slingshot extends GCompound
{
	// x- and y-components of velocity
	private double xVel;
	private double yVel;
	
	// are we moving?
	private boolean moving;
	
	public Slingshot()
	{
		GOval shot = new GOval(0, 0, 5, 5);
		shot.setFilled(true);
		add(shot);
		
		moving = false; // start out not moving
		
		// position us appropriately:
		setLocation(5, 190);
	}
	
	// parameters are initial x- and y-velocities
	public void fire(double x, double y)
	{
		// only fire if we're not moving
		if(moving == false)
		{
			// set the initial velocities as per parameters
			xVel = x;
			yVel = -y; // y has to be negative so that the shot goes up
			
			// reset to bottom left
			setLocation(5, 190); // use just plain setLocation because we want to move the tracing paper
			
			moving = true;
		}
	}
	
	// move the ball if appropriate
	public void update()
	{
		if(moving == true)
		{
			move(xVel, yVel);
			
			// the force of gravity increases yVel
			yVel = yVel + 0.1;
			
			// when we're past the bottom, stop.
			if(getY() + getHeight() > 200)
			{
				moving = false;
			}
		}
	}
}
