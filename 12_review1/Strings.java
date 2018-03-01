
public class Strings
{
	public static void main(String[] args)
	{
		String str = "hello";
		System.out.println(str);
		
		System.out.println(str.charAt(1));
		
		String str2 = str.substring(2);
		System.out.println(str2);
		
		String longStr = "Some really long string";
		System.out.println(longStr.substring(10));
		
		System.out.println(str.substring(1,4));
		
		String recombine = str.substring(0, 3) + str.substring(3);
		System.out.println(recombine);
		
		// if(str == recombine)  <-- DON'T DO THIS  
		if(str.equals(recombine))  // <-- DO THIS INSTEAD
		{
			System.out.println("they're equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
