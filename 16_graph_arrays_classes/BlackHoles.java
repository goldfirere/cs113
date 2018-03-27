/* Name: Richard Eisenberg
 * File: BlackHoles.java
 * Desc: clicking adds a new, growing black hole
 */
import acm.program.*;
import acm.graphics.*;
import java.util.*;
import acm.util.*;
import java.awt.event.*;

public class BlackHoles extends GraphicsProgram
{
  // our growing black holes
	private ArrayList<GOval> holes = new ArrayList<GOval>();
	
	@Override
	public void run()
	{
		// turn on the mouse and the timer:
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(80, this);
		t.start();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// make a new black hole
		GOval newHole = new GOval(e.getX() - 5, e.getY() - 5, 10, 10);
		newHole.setFilled(true);
		add(newHole);

		// add it to the ArrayList
		holes.add(newHole);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// make every hole grow using a loop
		int i = 0;
		while(i < holes.size())
		{
			GOval oneHole = holes.get(i);
			oneHole.setSize(oneHole.getWidth() + 2, oneHole.getHeight() + 2);
			oneHole.move(-1, -1);
			
			i = i + 1;
		}
	}
}
