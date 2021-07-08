import java.util.*;

public class StringDuplicate
{	
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		HashSet<Character> S= new HashSet<>();
		String s= sc.nextLine();
		int l= s.length();
		
		for(int i=0; i<l; ++i)
			S.add(s.charAt(i));
		
		for(char ch: S)
			System.out.print(ch);
	}
}
