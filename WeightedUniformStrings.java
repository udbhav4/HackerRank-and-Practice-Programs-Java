import java.util.*;

public class WeightedUniformStrings
{
	static Scanner sc= new Scanner(System.in);
	
	private String s= "";
	private int n= 0, queries[];
	
	private void input()
	{
		s= sc.nextLine();
		n= sc.nextInt();
		queries= new int[n];
		
		for(int i=0; i<n; ++i)
			queries[i]= sc.nextInt();
	}
	
	private void wus()
	{
		ArrayList<Integer> A= new ArrayList<Integer>(n);
		
		int l= s.length();
		char ch= s.charAt(0);
		int c= 1;
		A.add(ch - 96);
		
		for(int i=1; i<l; ++i)
		{
			if(s.charAt(i) == ch)
			{
				++c;
				A.add((ch - 96) * c);
			}
			else
			{
				ch= s.charAt(i);
				c= 1;
				A.add(ch - 96);
			}
		}
		
		for(int i=0; i<n; ++i)
			if(A.contains(queries[i]))
				System.out.println("Yes");
			else
				System.out.println("No");
	}
	
	public static void main(String[]args)
	{
		WeightedUniformStrings obj= new WeightedUniformStrings();
		obj.input();
		obj.wus();
	}
}
