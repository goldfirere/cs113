/* Name: Richard Eisenberg
 * File: ForLoop.java
 * Desc: Demonstrates a for loop by counting to 10
 */

public class ForLoop
{
	public static void main(String[] args)
	{	
		/* A for loop has three parts:
		 *   for(<init>; <condition>; <update>) { ... }
		 *   
		 * The <init> happens once, right before the loop starts.
		 * It's a good place to set up variables that you will use
		 * within the loop.
		 * 
		 * The <condition> is a boolean expression that is checked before
		 * going through the loop each time. It behaves just like the
		 * condition in a while loop.
		 * 
		 * The <update> is a statement that happens right at the end of
		 * the loop, before testing the condition.
		 * 
		 * Most of the time, your loop will look like this one:
		 */
		for(int num = 1; num <= 10; num++)
		{
			System.out.println(num);
		}
		
		/* Other tidbits:
		 *   num++
		 * is the same as
		 *   num = num + 1
		 * 
		 * You can also say num--
		 *   
		 *   i += x
		 * is the same as
		 *   i = i + x
		 * 
		 * That also works for -=, *=, /=, %=, and a few other exotic
		 * operations we have seen yet.
		 */
	}
}
