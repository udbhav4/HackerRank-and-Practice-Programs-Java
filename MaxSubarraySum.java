import java.util.*;

public class MaxSubarraySum
{
	private int t= 0, n= 0, m= 0, A[], B[];
	static Scanner sc= new Scanner(System.in);
	
	private void input()
	{
		t= sc.nextInt();
		B= new int[t];
		for(int i=0; i<t; ++i)
		{
			n= sc.nextInt();
			m= sc.nextInt();
			A= new int[n];
			for(int j=0; j<n; ++j)
				A[j]= sc.nextInt();
			calc(A, n, i);
		}
	}
	
	private void calc(int[]A, int n, int k)
	{
		int sum= 0, h= 0;
		
		for(int i=0; i<n; ++i)
		{
			for(int j=i; j<n; ++j)
			{
				sum+= A[j];
				
				if((sum%m) > h)
					h= sum%m;
			}
		}
		
		B[k]= h;
	}
	
	private void display()
	{
		for(int i=0; i<t; ++i)
			System.out.println(B[i]);
	}
	
	public static void main(String[]args)
	{
		MaxSubarraySum obj= new MaxSubarraySum();
		obj.input();
		obj.display();
	}
}
