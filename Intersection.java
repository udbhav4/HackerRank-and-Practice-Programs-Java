import java.util.*;

public class Intersection
{
	public static void main(String[]args)
	{
		int[]A= {1,1,2,2,2,3,5};
		int[]B= {1,1,1,2,2,4,5};
		
		HashMap<Integer, Integer> H1= new HashMap<>();
		HashMap<Integer, Integer> H2= new HashMap<>();
		
		for(int i: A)
		{
			if(H1.containsKey(i))
				H1.put(i, H1.get(i) + 1);
			else
				H1.put(i, 1);
		}
		
		for(int i: B)
		{
			if(H2.containsKey(i))
				H2.put(i, H2.get(i) + 1);
			else
				H2.put(i, 1);
		}
		
		
		for(Map.Entry<Integer, Integer> i: H1.entrySet())
		{
			int k= i.getKey();
			int v= i.getValue();
			if(H2.containsKey(k))
			{
				int min= Math.min(v, H2.get(k));
				for(int j=1; j<=min; ++j)
					System.out.print(k + " ");
			}
		}
	}
}
