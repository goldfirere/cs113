/* Name: Richard Eisenberg
 * File: Validate.java
 * Desc: Validates the dataset from
 *  https://www.census.gov/foreign-trade/statistics/historical/index.html
 *  by checking the trade balance against the difference between exports
 *  and imports
 */

import java.io.*;
import java.util.*;

public class Validate
{
	public static void main(String[] args)
	{
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
				validate(lineString);
				
				line = line + 1;
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found: " + e.getMessage());
		}	
	}
	
	// Validates a line of data by checking balance vs (export - import)
	public static void validate(String data)
	{
		ArrayList<String> parts =
				new ArrayList<>(Arrays.asList(data.split(",")));
		
		int totalBalance = Integer.parseInt(parts.get(1));
		int totalExport = Integer.parseInt(parts.get(4));
		int totalImport = Integer.parseInt(parts.get(7));
		
		if(totalExport - totalImport == totalBalance)
		{
			System.out.println(parts.get(0) + " validated");
		}
		else
		{
			System.out.println("Error in " + parts.get(0));
			System.out.println("Exports: " + totalExport);
			System.out.println("Imports: " + totalImport);
			System.out.println("Calculated balance: " +
			                   (totalExport - totalImport));
			System.out.println("Reported balance: " + totalBalance);
			System.out.println("Difference: " +
			                   (totalExport - totalImport - totalBalance));
		}
	}
}
