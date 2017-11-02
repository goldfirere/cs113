/* Name: Richard Eisenberg
 * File: Gands.java
 * Desc: A visualization of the economic data in gands.csv
 *
 * Note: This was written during class on Wed 11/1 and is
 * not as polished as other examples.
 */

import acm.program.*;

import java.io.*;
import java.util.*;

import acm.graphics.*;

public class Gands extends GraphicsProgram
{ 
	@Override
	public void run()
	{
		setSize(500, 500);
		
		ArrayList<Integer> balances = new ArrayList<Integer>();
		
		// This works for only one file, so bake in the filename
		try(Scanner file = new Scanner(new FileReader("gands.csv")))
		{
			// Discard first 6 lines:
			int line = 1;
			while(line <= 6)
			{
				file.nextLine(); // don't save it anywhere
				line = line + 1;
			}
			
			while(line <= 63)
			{
				String lineString = file.nextLine();
				String[] pieces = lineString.split(",");
				balances.add(Integer.parseInt(pieces[1]));
				
				line = line + 1;
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found: " + e.getMessage());
			return;
		}
		
		int min = balances.get(0);
		int max = balances.get(0);
		
		for(int balance : balances)
		{
			if(balance < min)
			{
				min = balance;
			}
			if(balance > max)
			{
				max = balance;
			}
		}
		
		double xPrev = rescale(1960, 1960, 2016, 0, getWidth());
		double yPrev = rescale(balances.get(0), min, max, getHeight(), 0);	
		
		int i = 0;
		while(i < balances.size())
		{
			int year = 1960 + i;
			int balance = balances.get(i);
			
			double x = rescale(year, 1960, 2016, 0, getWidth());
			double y = rescale(balance, min, max, getHeight(), 0);
			
			GOval dot = new GOval(x-2.5, y-2.5, 5, 5);
			dot.setFilled(true);
			add(dot);
			
			GLine line = new GLine(xPrev, yPrev, x, y);
			add(line);
			
			xPrev = x;
			yPrev = y;
		
			i = i + 1;
		}
		
		double yZero = rescale(0, min, max, getHeight(), 0);
		GLine zero = new GLine(0, yZero, getWidth(), yZero);
		add(zero);
	}
	
	// Rescales d from the range [lo1, hi1] to [lo2, hi2]
	public double rescale(double d, double lo1, double hi1, double lo2, double hi2)
	{
	  return (d - lo1) / (hi1 - lo1) * (hi2 - lo2) + lo2;	
	}
}
