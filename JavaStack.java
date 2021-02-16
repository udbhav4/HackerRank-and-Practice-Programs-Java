import java.util.*;

public class JavaStack
{
	private static Scanner sc= new Scanner(System.in);
	
	private boolean func(String s)
	{
		int l= s.length();
		int A[]= new int[3];
		char prev= 'a';
		
		for(int i=0; i<l; ++i)
		{
			char ch= s.charAt(i);
			
			if(ch == '(')
			{
				++A[0];
				prev= ch;
			}
			else if(ch == '{')
			{
				++A[1];
				prev= ch;
			}
			else if(ch == '[')
			{
				++A[2];
				prev= ch;
			}
			
			else if(ch == ')' && prev == ')')
			{
				--A[0];
				prev= 'a';
			}
			else if(ch == '}' && prev == '}')
			{
				--A[1];
				prev= 'a';
			}
			else if(ch == ']' && prev == ']')
			{
				--A[2];
				prev= 'a';
			}
			
			if(A[0] < 0 || A[1] < 0 || A[2] < 0)
				return false;
		}
		
		if(A[0] == 0 && A[1] == 0 && A[2] == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[]args)
	{
		JavaStack obj= new JavaStack();
		
		while(true)
		{
			String s= sc.nextLine();
			if(s.length() == 0)
				break;
			System.out.println(obj.func(s));
		}
	}
}