
public class InClass
{
	public static void main(String[] args)
	{
		String s = "hello";
		if(s.equals("hello"))
		{
			System.out.println("yes");
		}
		
		System.out.println(s.length());
		
		if(s.startsWith("ne"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(1,3));
		System.out.println(s.substring(2,5));
	}
}
