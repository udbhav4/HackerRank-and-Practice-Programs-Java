import java.util.*;

public class ActiveTraders 
{
	private static Scanner sc= new Scanner(System.in);
	
	private void func()
	{
		// Input.
		
		int n= sc.nextInt();
		String dump= sc.nextLine();
		String A[]= new String[n];
		
		for(int i=0; i<n; ++i)
			A[i]= sc.nextLine();
		
		// Solution begins.
		
		Arrays.sort(A);
		
		calculate(A, n);
	}
	
	private void calculate(String A[], int n)
	{
		String s= A[0];
		int c= 1;
		
		for(int i=1; i<n; ++i)
		{	
			double percentage= 0.0;
			
			if(A[i].equals(s))
				++c;
			else
			{
				percentage= ( (c*1.0)/n )*100;
				
				if(percentage >= 5)
					System.out.println(s);
				
				s= A[i];
				c= 1;
			}
			
			if(i == (n-1))
			{
				percentage= ( (c*1.0)/n )*100;
				
				if(percentage >= 5)
					System.out.println(s);
			}
		}
	}
	
	public static void main(String[]args)
	{
		ActiveTraders obj= new ActiveTraders();
		obj.func();
	}
}