import java.util.*;

public class MinimumLoss
{
	private int n= 0, A[];
	static Scanner sc= new Scanner(System.in);
	
	private void input()
	{
		n= sc.nextInt();
		A= new int[n];
		
		for(int i=0; i<n; ++i)
			A[i]= sc.nextInt();
	}
	
	private void run()
	{
		int min= 99999;
		
		for(int i=0; i<n; ++i)
		{
			for(int j= i+1; j<n; ++j)
			{
				int r= A[i] - A[j];
				if(r < min && r >= 0)
					min= r;
			}
		}
		
		System.out.println(min);
	}
	
	public static void main(String[]args)
	{
		MinimumLoss obj= new MinimumLoss();
		obj.input();
		obj.run();
	}
}
