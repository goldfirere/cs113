/* Name: Richard Eisenberg
 * File: SwapMutableIntegers
 * Desc: Demonstrates how swapping mutable integers can work
 */

public class SwapMutableIntegers
{
	public static void main(String[] args)
	{
		// first, try to swap two integers:
		int a = 5;
		int b = 10;
		System.out.println("Before swap: a = " + a + ", b = " + b);
		swapInt(a, b);
		System.out.println("After swap: a = " + a + ", b = " + b);
		
		MutableInteger c = new MutableInteger(5);
		MutableInteger d = new MutableInteger(10);
		System.out.println("Before swap: c = " + c + ", d = " + d);
		swapMI(c, d);
		System.out.println("After swap: c = " + c + ", d = " + d);
	}
	
	public static void swapInt(int w, int x)
	{
		int temp = w;
		w = x;
		x = temp;
	}
	
	public static void swapMI(MutableInteger y, MutableInteger z)
	{
		int temp = y.getValue();
		y.setValue(z.getValue());
		z.setValue(temp);
	}
}
