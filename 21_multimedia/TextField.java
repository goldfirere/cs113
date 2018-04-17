/* Name: Richard Eisenberg
 * File: TextField.java
 * Desc: Demonstrates using a text field in a GraphicsProgram
 */

import java.awt.event.*;

import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class TextField extends GraphicsProgram
{
	private JTextField text; // where the user enters a string
	private GLabel label; // where the string is repeated back

	@Override
	public void run()
	{
		text = new JTextField();
		text.setSize(50, 20);
		getGCanvas().add(text, 100, 100); // UI elements need getGCanvas()
		
		label = new GLabel("", 10, 10);
		add(label);
		
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		// update the label with what the user wrote
		label.setLabel(text.getText());
	}
}
