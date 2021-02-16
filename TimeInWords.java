import java.util.*;

public class TimeInWords
{
	static Scanner sc= new Scanner(System.in);
	
	private void calc()
	{
		int h= sc.nextInt();
		int m= sc.nextInt();
		
		String A[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
		
		if(m == 0)
			System.out.println(A[h] + " o' clock");
		
		else if(m < 30)
		{
			if(m == 15)
				System.out.println("quarter past " + A[h]);
			else if(m == 1)
				System.out.println(A[m] + " minute past " + A[h]);
			else
				System.out.println(A[m] + " minutes past " + A[h]);
		}
		
		else if(m == 30)
			System.out.println("half past " + A[h]);
		
		else
		{
			if(m == 45)
				System.out.println("quarter to " + A[h+1]);
			else if(m == 59)
				System.out.println(A[60-m] + " minute to " + A[h+1]);
			else
				System.out.println(A[60-m] + " minutes to " + A[h+1]);
		}
	}
	
	public static void main(String[]args)
	{
		TimeInWords obj= new TimeInWords();
		obj.calc();
	}
}