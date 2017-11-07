/* Name: Richard Eisenberg
 * File: ShowDarkeningCircles.java
 * Desc: Many darkening circles together
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.event.*;
import java.util.*;

public class ShowDarkeningCircles extends GraphicsProgram
{
	private ArrayList<DarkeningCircle> circs = new ArrayList<>();
	
	@Override
	public void run()
	{
		addMouseListeners();
		
		SwingTimer t = new SwingTimer(5, this);
		t.start();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		boolean inCircle = false;
				
		for(DarkeningCircle circ : circs)
		{
			if(circ.contains(e.getX(), e.getY()))
			{
				circ.whiten();
				inCircle = true;
			}
		}
		
		if(!inCircle)
		{
			DarkeningCircle circ = new DarkeningCircle(e.getX(), e.getY());
			add(circ);
			circs.add(circ);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int i = 0;
		while(i < circs.size())
		{
			circs.get(i).darken();
			i = i + 1;
		}
	}
}
