import java.util.Scanner;

public class ModifiedKaprekarNumber
{
	private static Scanner sc= new Scanner(System.in);
	
	int flag= 0;
	
	private void func()
	{
		int p= sc.nextInt();
		int q= sc.nextInt();
		
		for(int i=p; i<=q; ++i)
			isKaprekar(i);
		
		if(flag == 0)
			System.out.println("INVALID RANGE");
	}
	
	private void isKaprekar(int n)
	{
		long square= n*n;
		
		String s1= Integer.toString(n);
		int d1= s1.length();
		
		String s2= Long.toString(square);
		int d2= s2.length();
		
		int r= Integer.parseInt( s2.substring(d2-d1) );
		long l;
		String useless= s2.substring(0, (d2-d1));
		if(useless.equals(""))
			l= 0;
		else
			l= Long.parseLong(useless);
		
		if((r+l) == n)
		{
			System.out.print(n+" ");
			flag= 1;
		}
	}
	
	public static void main(String[]args)
	{
		ModifiedKaprekarNumber obj= new ModifiedKaprekarNumber();
		obj.func();
	}
}