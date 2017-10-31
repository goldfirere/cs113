/* Name: Richard Eisenberg
 * File: Rectangle.java
 * Desc: Stores information about a rectangle
 */

public class Rectangle
{
	// coordinates of center
	private int xCenter;
	private int yCenter;
	
	// size of rectangle
	private int width;
	private int height;
	
	// constructor takes the coordinates of the upper-left-hand corner
	// and the rectangle's width and height
	public Rectangle(int x, int y, int w, int h)
	{
		xCenter = x + w/2;
		yCenter = y + h/2;
		
		width = w;
		height = h;
	}
	
	// returns the x-coordinate of the center
	public int getX()
	{
		return xCenter;
	}
	
	// returns the y-coordinate of the center
	public int getY()
	{
		return yCenter;
	}
	
	// returns the area of the rectangle
	public int getArea()
	{
		return width * height;
	}
	
	// returns a nicely formatting string describing the rectangle
	@Override
	public String toString()
	{
		return "Rectangle centered at (" + xCenter + ", " + yCenter +
				") and sized " + width + "x" + height;
	}
}
