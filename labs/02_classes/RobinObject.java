/* Name: Richard Eisenberg
 * File: RobinObject.java
 * Description: represents a compound Robin object
 */
import acm.graphics.*;

// no import acm.program.*; We need that only for GraphicsPrograms

/*
 * This file represents a self-standing Robin object. This means that it
 * is now very easy to create multiple Robins within one applet, just by
 * saying new RobinObject() multiple times.
 */
public class RobinObject extends GCompound
{
	/*
	 * The region of code started with public RobinObject is called the
	 * constructor. Constructors are very similar to methods, both in
	 * how they are written and how they are used. The two differences
	 * between a constructor definition and a method definition is that
	 * a constructor definition does not use the word void and a
	 * constructor definition always uses the same name as the class.
	 * So, we have public RobinObject instead of public void
	 * somethingElse. The other difference between a
	 * constructor and a method is that constructors are called with
	 * 'new', whereas methods are not. A constructor is the first chunk
	 * of code within a class that gets run. Its responsibility (like
	 * the run method in your main applet class) is to set everything up
	 * so that the other methods can run without failing. Specifically,
	 * all fields should be set up with appropriate values or shapes.
	 */
	public RobinObject()
	{
		/*
		 * make Robin centered around the point (0, 0) -- you will always
		 * want to center compound objects around (0, 0) for easy
		 * manipulation later.
		 */
		GOval face = new GOval(-25, -25, 50, 50);
		GOval rightEye = new GOval(-13, -13, 10, 10);
		GOval leftEye = new GOval(3, -13, 10, 10);
		GLine diagonal = new GLine(0, -8, 4, 8);
		GLine horizontal = new GLine(0, 8, 4, 8);
		GLine mouth = new GLine(-8, 15, 8, 15);

		add(face);
		add(rightEye);
		add(leftEye);
		add(diagonal);
		add(horizontal);
		add(mouth);
	}
}
