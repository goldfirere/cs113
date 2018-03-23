/* Name: Richard Eisenberg
 * File: Visualization.java
 * Desc: Visualizes the GANDS data set.
 *       This was written in class, and is less well polished than
 *       other examples.
 */

import java.io.*;
import java.util.*;

import acm.graphics.*;
import acm.program.*;

public class Visualization extends GraphicsProgram
{
	private ArrayList<DataPoint> data = new ArrayList<>();
	
	@Override
	public void run()
	{
		resize(600, 600);
		
		try(Scanner input = new Scanner(new FileReader("gands.csv")))
		{
			// Skip the 6 header lines.
			int i = 0;
			while(i < 6)
			{
				input.nextLine();
				i = i + 1;
			}
			
			String line = "1"; // start with a number so as not to abort loop
			while(Character.isDigit(line.charAt(0))) // check for an initial digit
			{
				line = input.nextLine();
				if(Character.isDigit(line.charAt(0)))
				{
					String[] pieces = line.split(",");
					
					int year = Integer.parseInt(pieces[0]);
					int balance = Integer.parseInt(pieces[1]);
					
					// This creates a new DataPoint where we can store information
					DataPoint point = new DataPoint();
					point.setYear(year);
					point.setBalance(balance);
					data.add(point);
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Couldn't find the file: " + e);
		}

		// The coordinates of the last dot, so we can connect the dots
		double xLast = 0;
		double yLast = 0;
		
		int i = 0;
		while(i < data.size())
		{
			DataPoint point = data.get(i);
		
			// Calculate x- and y-coordinates by rescaling
			double x = rescale(point.getYear(), 1960, 2016, 0, getWidth());
			double y = rescale(point.getBalance(), -800000, 15000, getHeight(), 0);
			
			GOval dot = new GOval(x - 2.5, y - 2.5, 5, 5);
			dot.setFilled(true);
			add(dot);
			
			GLine connector = new GLine(xLast, yLast, x, y);
			add(connector);
			
			xLast = x;
			yLast = y;
			
			i = i + 1;
		}
		
		// Draw rules (lines) across the chart to show the scale
		int bal = 0;
		while(bal >= -800000)
		{
			double y = rescale(bal, -800000, 15000, getHeight(), 0);
			GLine rule = new GLine(0, y, getWidth(), y);
			add(rule);
			
			GLabel balLabel = new GLabel("" + bal, 0, y);
			add(balLabel);
			
			bal = bal - 100000;
		}
	}
	
	// Converts the number 'num' in the range between 'lo1' and 'hi2' into
	// the range between 'lo2' and 'hi2'.
	public double rescale(double num, double lo1, double hi1, double lo2, double hi2)
	{
		return (num - lo1) / (hi1 - lo1) * (hi2 - lo2) + lo2;
	}	
}
