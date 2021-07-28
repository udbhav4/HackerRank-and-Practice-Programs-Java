import java.util.*;

public class LLReverse
{
	LinkedList<Integer> L= new LinkedList<>();
	int n= 0, k= 0;
	static Scanner sc= new Scanner(System.in);
	
	private void input()
	{
		System.out.print("Enter the number of numbers: ");
		n= sc.nextInt();
		for(int i=1; i<=n; ++i)
			L.add(sc.nextInt());
		
		System.out.print("Enter k: ");
		k= sc.nextInt();
	}
	
	private void reverse()
	{
		int loops= n/k, c= 0;
		String s= "";
		
		for(int i=1; i<=n; ++i)
		{
			if(c == loops)
				System.out.print(L.remove() + " ");
			else
			{
				s= L.remove() + " " + s;
				if(i%k == 0)
				{
					++c;
					System.out.print(s);
					s= "";
				}
			}
		}
	}
	
	public static void main(String[]args)
	{
		LLReverse obj= new LLReverse();
		obj.input();
		obj.reverse();
	}
}
