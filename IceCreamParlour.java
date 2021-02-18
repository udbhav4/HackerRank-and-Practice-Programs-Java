import java.util.*;

public class IceCreamParlour
{
	static Scanner sc= new Scanner(System.in);
	
	private int t= 0, m[], n[], A[][];
	
	private void input()
	{
		t= sc.nextInt();
		m= new int[t];
		n= new int[t];
		A= new int[t][];
		
		for(int i=0; i<t; ++i)
		{
			m[i]= sc.nextInt();
			n[i]= sc.nextInt();
			A[i]= new int[n[i]];
			
			for(int j=0; j<n[i]; ++j)
				A[i][j]= sc.nextInt();
		}
	}
	
	private void calc()
	{
		for(int i=0; i<t; ++i)
		{
			int l= A[i].length;
			
			jloop: for(int j=0; j<(l-1); ++j)
			{
				if(A[i][j] > m[i])
					continue;
				
				for(int k=(j+1); k<l; ++k)
				{
					if((A[i][j] + A[i][k]) == m[i])
					{
						System.out.println((j+1)+" "+(k+1));
						break jloop;
					}
				}
			}
		}
	}
	
	public static void main(String[]args)
	{
		IceCreamParlour obj= new IceCreamParlour();
		obj.input();
		obj.calc();
	}
}
