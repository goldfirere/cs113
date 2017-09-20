/* Name: Richard
 * File: WhackAMoleStandard.java
 * Description: Plays the Whack-A-Mole game
 */
import acm.program.*;
import java.awt.event.*;
import acm.util.*;

public class WhackAMoleStandard extends GraphicsProgram
{
	// our lovely mole:
	private MoleStandard molly;
	
	// the random generator
	private RandomGenerator gen = new RandomGenerator();
	
	// create the moles, start the timer
	public void run()
	{
		molly = new MoleStandard();
		molly.setLocation(100, 100);
		add(molly);
		
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(1000, this);
		t.start();
	}
	
	public void mousePressed(MouseEvent e)
	{
		// if either was whacked...
		if(molly.contains(e.getX(), e.getY()))
		{
			java.awt.Toolkit.getDefaultToolkit().beep();
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// move the mole to a random location
		molly.setLocation(gen.nextInt(20, 180), gen.nextInt(20, 180));
	}
}
