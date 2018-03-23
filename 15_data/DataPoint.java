/* Name: Richard Eisenberg
 * File: DataPoint.java
 * Desc: Represents one data point in the GANDS dataset
 */

public class DataPoint
{
	private int year;
	private int balance;
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public void setBalance(int bal)
	{
		balance = bal;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getBalance()
	{
		return balance;
	}
}
