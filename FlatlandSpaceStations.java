import java.util.*;

public class FlatlandSpaceStations
{
	static Scanner sc=new Scanner(System.in);
	
	private int n, m, c[];
	
	private void input()
	{
		n= sc.nextInt();
		m= sc.nextInt();
		c= new int[m];
		
		for(int i=0; i<m; ++i)
			c[i]= sc.nextInt();
		
		Arrays.sort(c);
	}
	
	private void nearest()
	{
		int[]A= new int[n];
		
		for(int i=0; i<n; ++i)
		{
			int[]d= new int[m];
			
			for(int j=0; j<m; ++j)
				d[j]= Math.abs(c[j] - i);
			
			Arrays.sort(d);
			A[i]= d[0];
		}
		
		Arrays.sort(A);
		System.out.println(A[n-1]);
	}
	
	public static void main(String[]args)
	{
		FlatlandSpaceStations obj= new FlatlandSpaceStations();
		obj.input();
		obj.nearest();
	}
}
