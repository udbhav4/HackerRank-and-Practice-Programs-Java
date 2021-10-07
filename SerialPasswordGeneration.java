import java.util.Scanner;
public class SerialPasswordGeneration 
{

	String userName;
	String password;
	
	SerialPasswordGeneration(String userName,String password)
	{
		this.userName=userName;
		this.password=password;
	}
	
	
	private String passwordGenerator()
	{	
		String tempPass=null;
		System.out.println("Checking for Password\n.\n.\n.\n.\n");
		
		//using 4 loops as the password generates a 4-digit pin. We can also take password as int.
		for (int i = 0; i < 10; i++)
		{
			String s1 = String.valueOf(i);
			for (int j = 0; j < 10; j++)
			{
				String s2 = String.valueOf(j);
				for (int k = 0; k < 10; k++)
				{
					String s3 = String.valueOf(k);
					for (int l = 0; l < 10; l++)
					{
						String s4 = String.valueOf(l);
						tempPass = s1 + s2 + s3 + s4;
						
						if (tempPass.equals(password))
						{
							System.out.println("Password found!");
							return tempPass;
						}
						tempPass=null;
					}
				}
			}
		}	
				
		return tempPass;
	}
	
	public static void main(String[] args) {
		
		//Taking username and Password as Input:
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.println();
		System.out.print("Enter your 4-digit password: ");

		SerialPasswordGeneration obj=new SerialPasswordGeneration(username,sc.nextLine());
		
		String result=obj.passwordGenerator();
		
		if(result == null)
			System.out.println("Password not found!");
	}
}