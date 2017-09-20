/* Name: Richard
 * File: WhackAMoleProfessional.java
 * Description: Plays the Whack-A-Mole game
 */
import acm.program.*;
import java.awt.event.*;
import acm.util.*;

public class WhackAMoleProfessional extends GraphicsProgram
{
	// our lovely mole:
	private MoleProfessional molly;
	
	// the random generator
	private RandomGenerator gen = new RandomGenerator();

	// create the mole, start the timer
	public void run()
	{
		molly = new MoleProfessional();
		molly.setLocation(50, 100);
		add(molly);
		
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(1000, this);
		t.start();
	}
	
	public void mousePressed(MouseEvent e)
	{
		// if molly was whacked...
		if(molly.contains(e.getX(), e.getY()))
		{
			molly.whack();
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// move the mole
		molly.setLocation(gen.nextInt(20, 180), gen.nextInt(20, 180));
	}
}
