/* Name: Richard Eisenberg
 * File: PhilEnterprise.java
 * Description: A compound object for Phil the JavaBot
 */
import acm.graphics.*;

public class Phil2 extends GCompound
{
	private GLine antenna; // the growing line
	private PhilBody body; // the rest of the body
	
	public Phil2()
	{
		GOval antennaCircle = new GOval(-3, -3, 6, 6);
		antenna = new GLine(0, 3, 0, 10);
		body = new PhilBody();
		body.setLocation(0, 10);
	
		add(antennaCircle);
		add(antenna);
		add(body);
	}
	
	public void grow()
	{
		// move the body & grow the line
		body.setLocation(body.getX(), body.getY() + 5);
		antenna.setEndPoint(antenna.getEndPoint().getX(), antenna.getEndPoint().getY() + 5);
	}
}
