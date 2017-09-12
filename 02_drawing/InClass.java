import java.awt.*;

import acm.graphics.*;
import acm.program.*;

public class InClass extends GraphicsProgram
{
	@Override
	public void run()
	{
		GLabel whateverWeLike = new GLabel("Hello, world!", 10, 30);
		add(whateverWeLike);
		
		GRect rect = new GRect(70, 100, 20, 50);
		add(rect);
		
		GOval circle = new GOval(90, 90, 20, 20);
		add(circle);
		
		GRect blueSquare = new GRect(120, 150, 30, 30);
		blueSquare.setColor(Color.BLUE);
		blueSquare.setFilled(true);
		add(blueSquare);
		
		// Specify Red, Green, and Blue, in the range 0 - 255
		Color red = new Color(255, 0, 0);
		blueSquare.setColor(red);
		
		Color white = new Color(255, 255, 255);
		blueSquare.setFillColor(white);
		
		Color pink = new Color(255, 127, 127);
		blueSquare.setFillColor(pink);
	}
}
