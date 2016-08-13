import java.util.Scanner;

public class prime_interval_16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i;
		
		for(int j=a;j<=b;j++)
		{
		
		for(i=2;i<j;i++)
		{
			if(j%i==0)
				break;
		}
		if(j==i)
			System.out.println(j);
		
		
		}
		
		sc.close();
		
	

	}


}
