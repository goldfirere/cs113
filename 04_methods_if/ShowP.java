/* Name: Richard Eisenberg
 * File: ShowP.java
 * Description: Uses the Pinocchirobin class to show Robin
 */
import acm.program.*;
// no import acm.graphics.*; We don't use any built-in shapes here!
import java.awt.event.*;

public class ShowP extends GraphicsProgram
{
	private Pinocchirobin robin; // our nosy friend
	
	@Override
	public void run()
	{
		robin = new Pinocchirobin();
		robin.setLocation(100, 100);
		add(robin);
		
		addMouseListeners();
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		robin.growNose();  // this calls the method written in the other file
	}
}