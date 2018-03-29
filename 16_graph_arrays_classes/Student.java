/* Name: Richard Eisenberg
 * File: Student.java
 * Desc: A data class with information about a Student
 */

public class Student
{
	private String name;
	private int id;
	
	public Student()
	{
		// this doesn't need to do anything
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setId(int num)
	{
		id = num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
}
