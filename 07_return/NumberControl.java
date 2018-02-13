/* Name: Richard Eisenberg
 * File: NumberControl.java
 * Desc: simple number control made up of GLabels
 */
import acm.graphics.*;

public class NumberControl extends GCompound
{	
	// the buttons and display
	private GLabel left;
	private GLabel number;
	private GLabel right;
	
	private double num; // the number in the number control
	
	// ends of allowable range
	private double minimum;
	private double maximum;
	
	public NumberControl()
	{
		num = 0;
		
		// default range is 0 to 10:
		minimum = 0;
		maximum = 10;
		
		left = new GLabel("<", 0, 0);
		number = new GLabel("0", 10, 0);
		right = new GLabel(">", 30, 0);
		
		add(left);
		add(number);
		add(right);
	}
	
	// sets the number in the control
	public void setNumber(double newNum)
	{
		num = newNum;
		
		checkRange(); // make sure we're in the appropriate range
		updateDisplay(); // show the user
	}
	
	// the coordinates are applet coordinates and will need to be translated
	public void click(double x, double y)
	{
		if(left.contains(x - getX(), y - getY()))
		{
			num = num - 0.5;
		}
		
		if(right.contains(x - getX(), y - getY()))
		{
			num = num + 0.5;
		}
		
		checkRange();
		updateDisplay();
	}
	
	// get the current number
	public double getNumber()
	{
		return num;
	}
	
	// allow the applet to set the allowable range
	public void setRange(double min, double max)
	{
		// store in fields
		minimum = min;
		maximum = max;
		
		checkRange(); // maybe the current number is out of range and we need to update
		updateDisplay();
	}
	
	// ensure we're in the range
	public void checkRange()
	{
		if(num > maximum)
		{
			num = maximum;
		}
		
		if(num < minimum)
		{
			num = minimum;
		}
	}
	
	// update the label
	public void updateDisplay()
	{
		number.setLabel("" + num);
	}
}
