import java.util.*;

public class HackerlandRadio
{
	static Scanner sc= new Scanner(System.in);
	private int n= 0, k= 0, c= 0;
	Vector<Integer> V= new Vector<>();
	
	private void input()
	{
		n= sc.nextInt();
		k= sc.nextInt();
		for(int i=1; i<=n; ++i)
			V.add(sc.nextInt());
	}
	
	private void transmitters()
	{
		Collections.sort(V);
		int i= 0;
		
		while(i < V.size())
		{
			i= checkleft(i);
		}
		
		System.out.println(c);
	}
	
	private int checkleft(int i)
	{
		int d= V.get(i) + k;
		
		if(V.contains(d))
		{
			++c;
			i= checkright(V.indexOf(d));
		}
		else
		{
			while(V.contains(d) == false)
				--d;
			
			++c;
			i= checkright(V.indexOf(d));
		}
		
		return i;
	}
	
	private int checkright(int i)
	{
		int d= V.get(i) + k;
		
		if(V.contains(d))
			i= V.indexOf(d) + 1;
		else
		{
			while(V.contains(d) == false)
				--d;
			
			i= V.indexOf(d) + 1;
		}
		
		return i;
	}
	
	public static void main(String[]args)
	{
		HackerlandRadio obj= new HackerlandRadio();
		obj.input();
		obj.transmitters();
	}
}
