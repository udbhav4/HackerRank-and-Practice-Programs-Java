import java.util.*;

public class Pair
{
	static ArrayList<Integer> ratings= new ArrayList<>();
	
	private static int minimizeBias()
	{
		int sum= 0;
		
		for(int i=0; i < ratings.size(); ++i)
		{
			i= 0;
			int x= ratings.get(i), num= ratings.get(i);
			int diff= Integer.MAX_VALUE;
			
			for(int j=1; j < ratings.size(); ++j)
			{
				int r= Math.abs(ratings.get(j) - x);
				if(r < diff)
				{
					diff= r;
					num= ratings.get(j);
				}
			}
			
			sum += diff;
			ratings.remove(ratings.indexOf(x));
			ratings.remove(ratings.indexOf(num));
		}
		
		return sum;
	}
	
	public static void main(String[]args)
	{
		ratings.add(4);
		ratings.add(2);
		ratings.add(5);
		ratings.add(1);
		System.out.println(minimizeBias());
	}
}