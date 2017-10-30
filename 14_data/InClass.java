import java.io.*;
import java.util.*;

public class InClass
{
	public static void main(String[] args)
	{
		try(Scanner file = new Scanner(new FileReader("gands-1.csv")))
		{
			int j = 0;
			while(j < 6)
			{
				file.nextLine(); // throw it away
				j = j + 1;
			}
			
			while(file.hasNextLine())
			{
			  String line = file.nextLine();
			  
			  String[] pieces = line.split(",");
			  System.out.println(pieces[0]);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
