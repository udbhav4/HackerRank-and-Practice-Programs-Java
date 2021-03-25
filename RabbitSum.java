import java.util.*;

public class RabbitSum
{
	static Scanner sc= new Scanner(System.in);
	
	private int t, r, c, A[][], B[];
	
	private void input()
	{
		t= sc.nextInt();
		B= new int[t];
		for(int k=0; k<t; ++k)
		{
			r= sc.nextInt();
			c= sc.nextInt();
			A= new int[r][c];
		
			for(int i=0; i<r; ++i)
				for(int j=0; j<c; ++j)
					A[i][j]= sc.nextInt();
			
			calc(A, r, c, k);
		}
	}
	
	private void calc(int[][] A, int r, int c, int k)
	{
		int f= 0;
		int rd= r/2, cd= c/2;
		
		while(rd != -1 && cd != -1)
		{
			for(int i= rd; i< (r-rd); ++i)   
			{
				for(int j=cd; j< (c-cd); ++j)
				{
					int t= 0;
					int b= 0;
					int right= 0;
					int left= 0;
					
					if(i != 0)
						t= A[i][j] - A[i-1][j];
					if(i != (r-1))
						b= A[i][j] - A[i+1][j];
					if(j != (c-1))
						right= A[i][j] - A[i][j+1];
					if(j != 0)
						left= A[i][j] - A[i][j-1];
				
					if(t < -1 || t > 1)
					{
						if(t < -1)
							A[i][j] += (Math.abs(t) - 1);
						else
							A[i-1][j] += (t - 1);
						
						f += (Math.abs(t)-1);
					}
				
					if(b < -1 || b > 1)
					{
						if(b < -1)
							A[i][j] += (Math.abs(b) - 1);
						else
							A[i+1][j] += (b - 1);
					
						f += (Math.abs(b)-1);
					}
					
					if(right < -1 || right > 1)
					{
						if(right < -1)
							A[i][j] += (Math.abs(right) - 1);
						else	
							A[i][j+1] += (right - 1);
					
						f += (Math.abs(right)-1);
					}
				
					if(left < -1 || left > 1)
					{
						if(left < -1)
							A[i][j] += (Math.abs(left) - 1);
						else
							A[i][j-1] += (left - 1);
					
						f += (Math.abs(left)-1);
					}
				}
			}
			
			if(rd >= cd)
				--rd;
			if(cd >= rd)
				--cd;
		}
		
		B[k]= f;
	}
	
	public static void main(String[]args)
	{
		RabbitSum obj= new RabbitSum();
		obj.input();
		for(int i=0; i<obj.t; ++i)
			System.out.println("Case #" + (i+1) + ": " + obj.B[i]);
	}
}
