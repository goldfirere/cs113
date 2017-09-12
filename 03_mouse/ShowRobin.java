/* Name: Richard Eisenberg
 * File: ShowRobin.java
 * Description: Uses the RobinObject class to show Robin
 */
import acm.program.*;
// no import acm.graphics.*; We don't use any built-in shapes here!

public class ShowRobin extends GraphicsProgram
{
	@Override
	public void run()
	{
		// create two RobinObjects in different locations:
		RobinObject robin = new RobinObject();
		robin.setLocation(50, 100);

		RobinObject robina = new RobinObject();
		robina.setLocation(150, 100);

		add(robin);
		add(robina);
	}
}