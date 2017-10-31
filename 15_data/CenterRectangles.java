/* Name: Richard Eisenberg
 * File: CenterRectangles.java
 * Desc: Finds the "center of mass" of a set of rectangles
 */
import java.io.*;
import java.util.*;

public class CenterRectangles
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What file should I read? ");
		String filename = in.nextLine();
		
		ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
		
		try(Scanner file = new Scanner(new FileReader(filename)))
		{
			while(file.hasNextInt())
			{
				int x = file.nextInt();
				int y = file.nextInt();
				int w = file.nextInt();
				int h = file.nextInt();
				
				// discard the color numbers:
				file.nextInt();
				file.nextInt();
				file.nextInt();
				
				Rectangle r = new Rectangle(x, y, w, h);
				rects.add(r);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: " + e);
			return; // abort program on error
		}
		
		System.out.println("The file contained the following rectangles:");
		for(Rectangle r : rects)
		{
			System.out.println(r); // automatically calls the toString() method
		}
		
		int xSum = 0, ySum = 0; // these will store the running, weighted sums
		int totalArea = 0; // running sum of the total area
		for(Rectangle r : rects)
		{
			xSum = xSum + r.getX() * r.getArea();
			ySum = ySum + r.getY() * r.getArea();
			totalArea = totalArea + r.getArea();
		}
		
		double xCenter = 1.0 * xSum / totalArea;
		double yCenter = 1.0 * ySum / totalArea;
		
		System.out.println("The center of mass of the rectangles is at ("
				                 + xCenter + ", " + yCenter + ").");
	}
}
