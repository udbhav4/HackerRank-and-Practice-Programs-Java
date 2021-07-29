public class Pattern
{
	public static void main(String[]args)
	{
		int c= 0;
		for(int i=1; i<=6; ++i)
		{
			for(int j=1; j<=i; ++j)
			{
				if(j == 1)
					c= i;
				else if(j == 2)
					c += (i + j);
				else
					c += i;
				
				System.out.print(c + " ");
			}
			
			System.out.println();
		}
	}
}
