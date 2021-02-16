import java.util.Scanner;

public class BombermanGame
{
	private static Scanner sc= new Scanner(System.in);
	
	private void input()
	{
		int r= sc.nextInt();
		int c= sc.nextInt();
		String dump= sc.nextLine();
		
		char A[][]= new char[r][c];
		
		for(int i=0; i<r; ++i)
		{
			String s= sc.nextLine();
			char B[]= s.toCharArray();
			for(int j=0; j<c; ++j)
				A[i][j]= B[j];
		}
		
		detonate(r, c, A);
	}
	
	private void detonate(int r, int c, char A[][])
	{
		for(int i=0; i<r; ++i)
		{
			for(int j=0; j<c; ++j)
			{
				if(A[i][j] == 'O')
					A[i][j]= 'B';
				else
					A[i][j]= 'O';
			}
		}
		
		for(int i=0; i<r; ++i)
		{
			for(int j=0; j<c; ++j)
			{
				if(A[i][j] == 'B')
				{
					A[i][j]= '.';
					
					if(i != (r-1) && A[i+1][j] != 'B')
						A[i+1][j]= '.';
					if(i != 0 && A[i-1][j] != 'B')
						A[i-1][j]= '.';
					if(j != (c-1) && A[i][j+1] != 'B')
						A[i][j+1]= '.';
					if(j != 0 && A[i][j-1] != 'B')
						A[i][j-1]= '.';
				}
			}
		}
		
		display(r, c, A);
	}
	
	private void display(int r, int c, char A[][])
	{
		for(int i=0; i<r; ++i)
		{
			for(int j=0; j<c; ++j)
			{
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[]args)
	{
		BombermanGame obj= new BombermanGame();
		obj.input();
	}
}