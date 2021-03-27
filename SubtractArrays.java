import java.util.*;

public class SubtractArrays
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		Vector<Integer> A= new Vector<>();
		for(int i=0; i<n; ++i)
			A.add(sc.nextInt());
		
		int m= sc.nextInt();
		for(int i=0; i<m; ++i)
		{
			int t= sc.nextInt();
			if(A.contains(t));
			else
				System.out.print(t+" ");;
		}
	}
}
