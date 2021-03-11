import java.util.*;

public class PalindromeSubstring
{
	private static String s= "";
	static Scanner sc= new Scanner(System.in);
	
	private void palin()
	{
		int l= s.length();
		int h= 1;
		String sub= "";
		
		for(int i=0; i<(l-1); ++i)
		{
			String p= ""+s.charAt(i);
			
			for(int j= i+1; j<l; ++j)
			{
				p+=s.charAt(j);
				
				if(ispalindrome(p) && p.length() > h)
				{
					h= p.length();
					sub= p;
				}			
			}
		}
		
		System.out.println(sub);
	}
	
	private boolean ispalindrome(String p)
	{
		int l= p.length();
		boolean flag= true;
		
		for(int i=0; i< l/2; ++i)
		{
			if(p.charAt(i) != p.charAt(l-i-1))
				flag= false;
		}
		
		return flag;
	}
	
	public static void main(String[]args)
	{
		s= sc.nextLine();
		
		PalindromeSubstring obj= new PalindromeSubstring();
		obj.palin();
	}
}
