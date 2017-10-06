/* Name: Richard Eisenberg
 * File: Greater.java
 * Desc: prints the greater of two numbers given by the user
 */
import java.util.*;

public class Greater
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		System.out.print("Ener another number: ");
		int num2 = in.nextInt();
		
		System.out.print("The greater number is ");
		if(num > num2)
		{
			System.out.println(num);
		}
		else
		{
			System.out.println(num2);
		}
		
		in.close();
	}
}
