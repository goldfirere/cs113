/* Name: Richard Eisenberg
 * File: Arithmetic.java
 * Desc: Demonstration of how Java does arithmetic
 */

// This file makes the most sense viewing the code while comparing
// it to the output.
public class Arithmetic
{
	public static void main(String[] args)
	{
		int x = 4 + 5;
		System.out.println(x);
		
		x = 4 + 5 * 2;
		System.out.println(x);
		
		x = (4 + 5) * 2;
		System.out.println(x);
		
		x = (3 - (4 + 5)) * 3;
		System.out.println(x);
		
		x = 20 / 4;
		System.out.println(x);
		
		x = 19 / 4; // division rounds toward 0
		System.out.println(x);
		
		x = -19 / 4;
		System.out.println(x);
		
		x = 99 / 100;
		System.out.println(x);
		
		x = 19 / 4 * 4;
		System.out.println(x);
		
		double d = 19 / 4;
		System.out.println(d);
		
		d = 19.0 / 4.0;
		System.out.println(d);
		
		d = 19. / 4.;
		System.out.println(d);
		
		d = 19. / 4;
		System.out.println(d);
		
		d = 1.0 * 19 / 4;
		System.out.println(d);
		
		d = 1.0 * (19 / 4);
		System.out.println(d);
		
		x = 2000000000; // 2 billion, 2 * 10^9, 9 zeroes
		System.out.println(x);
		
		x = x + x;
		System.out.println(x);
		
		x = 10 % 3; // computes the remainder
		System.out.println(x);
		
		x = 11 % 3;
		System.out.println(x);
		
		x = 12 % 3;
		System.out.println(x);
		
		x = 5 % 8;
		System.out.println(x);
	}
}
