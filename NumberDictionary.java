import java.util.*;

public class NumberDictionary
{
	private int n= 0;
	static Scanner sc= new Scanner(System.in);
	
	private void run()
	{
		n= sc.nextInt();
		int d= 1;
		System.out.println(d);
		int c= 0;
		
		for(int i=10; i<=n; ++i)
		{
			if(c == 10)
			{
				c= 0;
				System.out.println(++d);
			}
			
			System.out.println(i);
			++c;
		}
	}
	
	public static void main(String[]args)
	{
		NumberDictionary obj= new NumberDictionary();
		obj.run();
	}
}
