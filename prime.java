import java.util.Scanner;

public class prime_13 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int i;
		if(a==0)
			System.out.println("invalid");
		else
		{
		
		for(i=2;i<a;i++)
		{
			if(a%i==0)
				break;
		}
		if(a==i)
			System.out.println("prime");
		else
			System.out.println("not a prime");
		
		}
		
		sc.close();
		
	

	}

}
