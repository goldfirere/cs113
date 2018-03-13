import java.io.*;
import java.util.*;

public class Valid
{
	public static void main(String[] args)
	{
		try(Scanner file = new Scanner(new FileReader("gands-2.csv")))
		{
			int lineNumber = 1;
			while(lineNumber <= 6)
			{
				file.nextLine(); // discards the line
				lineNumber = lineNumber + 1;
			}
			
			String line = file.nextLine();
			String[] pieces = line.split(",");
			
			int balance = Integer.parseInt(pieces[1]);
			int export = Integer.parseInt(pieces[4]);
			int imp = Integer.parseInt(pieces[7]);
			
			System.out.println(export - imp == balance);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Couldn't find file");
		}
		
		System.out.println("Done");
	}
}
