import java.util.*;

public class CandidateCode
{
	ArrayList<Integer> strength= new ArrayList<>();
	ArrayList<Integer> energy= new ArrayList<>();
	int t = 0, n = 0;
	static Scanner sc= new Scanner(System.in);
	
	private void run()
	{
		t = sc.nextInt();
		
		for(int i=1; i<=t; ++i)
		{
			n = sc.nextInt();
			for(int j=0; j<n; ++j)
				strength.add(sc.nextInt());
			for(int j=0; j<n; ++j)
				energy.add(sc.nextInt());
			
			Collections.sort(strength);
			Collections.sort(energy);
			
			result();
		}
	}
	
	private void result()
	{
		boolean flag = true;
		
		for(int i=0; i<n; ++i)
		{
			if(strength.get(i) > energy.get(i))
			{
				flag = false;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("WIN");
		else
			System.out.println("LOSE");
	}
	
	public static void main(String[]args)
	{
		CandidateCode obj= new CandidateCode();
		obj.run();
	}
}
