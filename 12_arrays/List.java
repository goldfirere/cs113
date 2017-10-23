/* Name: Richard Eisenberg
 * File: List.java
 * Desc: Accepts a list of numbers from the user and then repeats them
 */

import java.util.*; // <-- necessary for ArrayLists

public class List
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you have? ");
		int numNumbers = in.nextInt();
		
		// We are about to collect the numbers. But we need a place to
		// put them. A good place to store them is in an ArrayList.
		ArrayList<Integer> list = new ArrayList<Integer>();
	  // The line above creates an ArrayList capable of storing Integers.
		// For our purposes now, an Integer is the same as an int. But we
		// have to use Integer when making an ArrayList.
		
		// The short version of this story: you can make ArrayLists only of
		// *reference* types, which generally begin with a capital letter.
		// You can't make ArrayLists of *primitive* types, which all begin
		// with a lowercase letter (such as int, boolean, double, etc.). Each
		// primitive type has a corresponding reference type that behaves
		// similarly. The reference types are all the same name as the
		// primitive types, but with capital letters at the beginning and
		// any abbreviations spelled out. So we have Integer instead of int
		// and Double instead of double.
		
		// Now, we use a loop to fill the list:
		int i = 0;
		while(i < numNumbers)
		{
			System.out.print("Enter a number: ");
			int n = in.nextInt();
			list.add(n); // the `add` command adds to the end of the list
			
			i = i + 1;
		}
		
		// Now, we can print the numbers out using another loop:
		System.out.println("Here are your numbers:");
		i = 0;
		while(i < numNumbers)
		{
			System.out.println(list.get(i));
			// The line above uses the `get(i)` command to retrieve an element
			// from a list. The minimum index is *always* 0, so it's important
			// that we decided to start our `i` at 0.
			
			i = i + 1;
		}
		
		// Loops like the one above are so common, Java allows this shorter
		// version:
		System.out.println("Here they are again:");
		for(int num : list)
		{
			System.out.println(num);
		}
		// This kind of loop starts at the beginning and works its way
		// toward the end of the list, with the variable `num` referring
		// to each number in the list successively.
	}
}
