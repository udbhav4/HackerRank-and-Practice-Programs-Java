import java.util.*;
import java.lang.Math;

public class RoadRepair
{
	private static Scanner sc= new Scanner(System.in);
	
	private void func()
	{
		// Input
		
		int n1= sc.nextInt();
		int[]Crew= new int[n1];
		for(int i=0; i<n1; ++i)
			Crew[i]= sc.nextInt();
		
		int n2= sc.nextInt();
		int[]Job= new int[n2];
		for(int i=0; i<n2; ++i)
			Job[i]= sc.nextInt();
		
		// Solution starts.
		
		Arrays.sort(Crew);
		Arrays.sort(Job);
		
		calculate(Crew, n1, Job, n2);
	}
	
	private void calculate(int Crew[], int n1, int Job[], int n2)
	{
		int i=0, j=0;
		long d=0;
		
		while(i < n1 && j < n2)
		{
			d+= Math.abs(Job[j] - Crew[i]);
			++i;
			++j;
		}
		
		System.out.println(d);
	}
	
	public static void main(String[]args)
	{
		RoadRepair obj= new RoadRepair();
		obj.func();
	}
}