/* Name: Richard Eisenberg
 * File: Colors.java
 * Desc: An example of how to mix colors in Java
 */

import java.awt.*; // <-- any program with colors needs this

import acm.program.*;
import acm.graphics.*;

public class Colors extends GraphicsProgram
{
	@Override
	public void run()
	{
		// a plain old boring rectangle:
		GRect boring = new GRect(10, 10, 30, 20);
		add(boring);
		
		// a circle with a cyan outline:
		GOval cyanCircle = new GOval(50, 10, 20, 20);
		cyanCircle.setColor(Color.CYAN);
		add(cyanCircle);
		
		// a big filled-in square:
		GRect bigSquare = new GRect(80, 20, 50, 50);
		bigSquare.setFilled(true); // this is what makes it filled in
		bigSquare.setFillColor(Color.BLUE);
		add(bigSquare);
		
		// It's Christmas!
		GOval christmas = new GOval(10, 100, 40, 40);
		christmas.setFilled(true);
		christmas.setFillColor(Color.RED);
		christmas.setColor(Color.GREEN);
		add(christmas);
		
		// We can make our own colors using RGB (Red/Green/Blue) numbers.
		// Each RGB number ranges from 0 (none of that color) to 255
		// (all of that color). Because we're talking about mixing colors
		// to produce light (as opposed to paint), all the colors together
		// make white.
		Color myWhite = new Color(255, 255, 255);
		GRect whiteBlock = new GRect(10, 130, 40, 10);
		whiteBlock.setFilled(true);
		whiteBlock.setFillColor(myWhite);
		add(whiteBlock);
		
		// Red is full red and none of the other colors:
		Color myRed = new Color(255, 0, 0);
		GRect redBlock = new GRect(60, 130, 40, 10);
		redBlock.setFilled(true);
		redBlock.setFillColor(myRed);
		add(redBlock);
		
		// Pink is halfway between red and white: just average the numbers
		Color pink = new Color(255, 128, 128);
		GRect pinkBlock = new GRect(110, 130, 40, 10);
		pinkBlock.setFilled(true);
		pinkBlock.setFillColor(pink);
		add(pinkBlock);
	}
}
