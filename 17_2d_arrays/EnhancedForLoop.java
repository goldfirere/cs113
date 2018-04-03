import java.util.*;

public class EnhancedForLoop
{
	public static void main(String[] args)
	{
		ArrayList<Integer> squares = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
		{
			squares.add(i * i);
		}
		
		for(int sq : squares)
		{
			System.out.println(sq);
		}
	}
}
