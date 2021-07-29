import java.util.Scanner;

public class Pattern2
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int l= s.length();
		
		for(int i=0; i<l; ++i)
		{
			if(i == 0)
				System.out.println(s);
			else
			{
				if(s.charAt(i) == s.charAt(l-1))
					System.out.println(s.charAt(l-1));
				else
					System.out.println(s.charAt(i)+""+s.charAt(l-1));
			}
		}
	}
}
