/* Name: Richard Eisenberg
 * File: Hitchhiker.java
 * Description: draws the hitchhiker to the screen, and demonstrates images
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*; // <-- need this import to use MediaTools

public class Hitchhiker extends GraphicsProgram
{
	@Override
	public void run()
	{
		/*
		 * To show images, we use the new graphical element GImage. To
		 * make a GImage, we need the image to show and the coordinates
		 * of the upper-left corner of the image. To get the image to
		 * show, we use the MediaTools.loadImage command. The file must
		 * be in the same folder as the code that loads it (the .java
		 * file).
		 */
		GImage greenie = new GImage(MediaTools.loadImage("hitchhiker.jpg"), 0, 0);
		add(greenie);
	}
}
