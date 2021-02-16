import java.util.*;

public class BiggerIsGreater
{
	static Scanner sc= new Scanner(System.in);
	int t=0;
	
	private void func()
	{
		// Inputs.
		t= sc.nextInt();
		String dump= sc.nextLine();
		
		String A[]= new String[t];
		for(int i=0; i<t; ++i)
			A[i]= sc.nextLine();
		
		// Work.
		for(int i=0; i<t; ++i)
			change(A[i]);
	}
	
	private void change(String s)
	{
		int l= s.length();
		int flag= 0;
		
		outer: for(int i= l-1; i>=0; --i)
		{	
			for(int j= i-1; j>=0; --j)
			{
				if(s.charAt(j) < s.charAt(i))
				{
					flag= 1;
					s= s.substring(0,j) + s.charAt(i) + sort(s.substring(j+1, i) + s.charAt(j) + s.substring(i+1));
					break outer;
				}
			}
		}
		
		if(flag == 1)
			System.out.println(s);
		else
			System.out.println("no answer");
	}
	
	private String sort(String s)
	{
		char B[]= s.toCharArray();
		Arrays.sort(B);
		s= new String(B);
		return s;
	}
	
	public static void main(String[]args)
	{
		BiggerIsGreater obj= new BiggerIsGreater();
		obj.func();
	}
}