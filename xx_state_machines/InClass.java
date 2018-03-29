
public class InClass
{
	public static void main(String[] args)
	{
		int n = 5;
		double pi = 3.14;
		
		// ...
		n = 3;
		
		String s = "hello";
		s = "goodbye";
		
		MutableInteger a = new MutableInteger(5);
		System.out.println(a);
		
		MutableInteger b = new MutableInteger(a.getValue());
		a.setValue(10);
		System.out.println(b);
		
		int c = 5;
		System.out.println(c);
		
		int d = c;
		c = 10;
		System.out.println(d);
		
	}
}
