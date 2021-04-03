import java.util.*;

public class GameOfExecution
{
	private int n= 0, k= 0;
	private Vector<Integer> V;
	static Scanner sc= new Scanner(System.in);
	
	private void run()
	{
		n= sc.nextInt();
		V= new Vector<>(n);
		for(int i=0; i<n; ++i)
			V.add(i);
		k= sc.nextInt();
		
		int x= calc(V, 0);
		
		System.out.println(x);
	}
	
	private int calc(Vector<Integer> V, int i)
	{
		if(V.size() == 1)
			return V.get(0);
		
		else
		{
			int index= i+k-1;
			if(index >= V.size())
				index %= V.size();
			
			V.remove(index);
			return calc(V, index);
		}
	}
	
	public static void main(String[]args)
	{
		GameOfExecution obj= new GameOfExecution();
		obj.run();
	}
}
