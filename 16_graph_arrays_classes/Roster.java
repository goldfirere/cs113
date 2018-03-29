/* Name: Richard Eisenberg
 * File: Roster.java
 * Desc: Builds and queries a student roster
 */

import java.util.*;

public class Roster
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many students? ");
		int numStudents = in.nextInt();
		in.nextLine(); // in.nextInt() consumes only the number; this grabs
		               // the newline, too
		
		// make a place to store students, where a student stores both a
		// name and an ID#
		ArrayList<Student> roster = new ArrayList<>();
		
		int i = 0;
		while(i < numStudents)
		{
			System.out.print("Name of student #" + (i + 1) + ": ");
			String name = in.nextLine();
			
			System.out.print("ID# of student #" + (i + 1) + ": ");
			int id = in.nextInt();
			in.nextLine();
			
			// Create the student object, and set its fields
			Student stu = new Student();
			stu.setName(name);
			stu.setId(id);
			
			// add the student to the roster
			roster.add(stu);
			
			i = i + 1;
		}
			
		while(true) // repeat forever
		{
			System.out.print("Enter a student name (or blank to exit): ");
			String name = in.nextLine();
			
			// if the user entered a blank, end the program by leaving 'main'
			if(name.length() == 0)
			{
				System.out.println("Good-bye.");
				return;
			}
			
			// have we found a student? Assume not.
			boolean found = false;
			
			int j = 0;
			while(j < roster.size())
			{
				Student stu = roster.get(j); // 'stu' is the jth student
				String stuName = stu.getName(); // 'stuName' is the name of 'stu'
				if(stuName.equals(name))
				{
					System.out.println("ID of " + name + " is " + stu.getId());
					found = true; // remember that we found someone
				}
				
				j = j + 1;
			}
			
			// report an error if the search failed
			if(!found)
			{
				System.out.println("I couldn't find " + name);
			}
		}
	}
}
