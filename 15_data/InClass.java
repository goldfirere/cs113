
import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;

public class InClass extends GraphicsProgram
{
	private GRect mattress;
	private boolean mattressMoving;
	
	@Override
	public void run()
	{
		mattress = new GRect(80, 190, 40, 10);
		mattress.setFilled(true);
		add(mattress);
		
		mattressMoving = false;
		
		addKeyListeners();
		
		SwingTimer t = new SwingTimer(25, this);
		t.start();
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			mattressMoving = true;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e)
	{
		mattressMoving = false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(mattressMoving)
		{
			mattress.move(5,0);
		}
	}
}
