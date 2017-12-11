/* Name: Richard Eisenberg
 * File: Texty.java
 * Desc: Demonstrates the use of a text field in a GraphicsProgram
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;
import java.awt.event.*;

public class Texty extends GraphicsProgram
{
	private GRect r; // this rectangle is just to show that "G" graphics
	                 // stuff still works
	private TextField field; // some text the user can enter
	
	@Override
	public void run()
	{
		r = new GRect(100, 100, 20, 20);
		add(r);
		
		getGCanvas().setLayout(null); // this needs to be run just once
		                              // in run()
		
		field = new TextField(); // create the TextField
		field.setBounds(50, 50, 100, 20); // this is how to set the field's 
		                                  // location (it's like a GRect, with
		                                  // the parameters being x, y,
		                                  // width, height)
		getGCanvas().add(field); // NB: you need "getGCanvas()." before
		                         // the add. This is important!
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// Normal mouse interactions still work:
		if(r.contains(e.getX(), e.getY()))
		{
			r.setFilled(true);
		}
		else
		{
			System.out.println(field.getText());
		}
	}
}
