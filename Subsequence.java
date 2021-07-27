import java.util.*;

public class Subsequence
{
	private String s= "";
	private HashSet<String> S= new HashSet<>();
	static Scanner sc= new Scanner(System.in);
	
	private void input()
	{
		s= sc.nextLine();
	}
	
	private void subseq()
	{
		int l= s.length();
		for(int i=0; i<l; ++i)
		{
			char ch= s.charAt(i);
			
			for(String j: S)
			{
				String x= j+ ch;
				S.add(x);
			}
		}
		
		System.out.println(S.size());
	}
	
	public static void main(String[]args)
	{
		Subsequence obj= new Subsequence();
		obj.input();
		obj.subseq();
	}
}
