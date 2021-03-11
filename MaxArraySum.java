import java.util.*;

public class MaxArraySum
{
	private int n, A[], sum;
	
	static Scanner sc= new Scanner(System.in);
	
	private void input()
	{
		n= sc.nextInt();
		A= new int[n];
		
		for(int i=0; i<n; ++i)
		{
			A[i]= sc.nextInt();
			sum+=A[i];
		}
	}
	
	private void maxsum()
	{
		int h= sum;
		int i= n;
		
		int beg= 0, end= n-1;
		
		while(i != 1)
		{
			if(A[beg] < A[end])
			{
				sum-=A[beg];
				if(sum > h)
					h= sum;
				++beg;
			}
			else
			{
				sum-=A[end];
				if(sum > h)
					h= sum;
				--end;
			}
			
			--i;
		}
		
		System.out.println(h);
	}
	
	public static void main(String[]args) throws Exception
	{
		MaxArraySum obj= new MaxArraySum();
		obj.input();
		obj.maxsum();
	}
}