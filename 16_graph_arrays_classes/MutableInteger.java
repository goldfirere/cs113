/* Name: Richard Eisenberg
 * File: MutableInteger.java
 * Desc: A class that contains an integer that can be changed
 */

public class MutableInteger
{
	private int value; // the actual value of the object

	/* constructs a new MutableInteger with the given value */
	public MutableInteger(int startingVal)
	{
		value = startingVal;
	}

	// returns the value; called an 'accessor' or 'getter' method
	public int getValue()
	{
		return value;
	}

	// changes the value; called a 'mutator' or 'setter' method
	public void setValue(int newValue)
	{
		value = newValue;
	}
	
	// produce the string representation of the contents
	@Override
	public String toString()
	{
		return "" + value; // use built-in string conversion for int
	}
}
