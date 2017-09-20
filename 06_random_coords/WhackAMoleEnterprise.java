/* Name: Richard
 * File: WhackAMoleEnterprise.java
 * Description: Plays the Whack-A-Mole game
 */
import acm.program.*;
import java.awt.event.*;
import acm.util.*;

public class WhackAMoleEnterprise extends GraphicsProgram
{
	// our lovely mole:
	private MoleProfessional molly;
	
	// did we whack recently?
	private int recentWhack;
	
	// the random generator
	private RandomGenerator gen = new RandomGenerator();

	// create the mole, start the timer
	public void run()
	{
		molly = new MoleProfessional();
		molly.setLocation(50, 100);
		add(molly);
		
		addMouseListeners();
		
		recentWhack = 0; // no recent whack
		
		SwingTimer t = new SwingTimer(1000, this);
		t.start();
	}
	
	public void mousePressed(MouseEvent e)
	{
		// if molly was whacked...
		if(molly.contains(e.getX(), e.getY()))
		{
			if(recentWhack == 0) // only record if there isn't a recent whack
			{
				molly.whack();
				
				recentWhack = 1; // record that whack
			}
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		// move the mole
		molly.setLocation(gen.nextInt(20, 180), gen.nextInt(20, 180));
		
		// reset the recent whack
		recentWhack = 0;
	}
}
