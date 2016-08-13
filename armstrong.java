import java.util.Scanner;

public class amstrong_17
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int c=String.valueOf(a).length();
		
		int sum=0;
		for(int i=0;i<c;i++)
		{
			sum=(int) (sum+Math.pow(Integer.parseInt(String.valueOf(a).substring(i, i+1)), c));
		}
		
		if(a==sum)
			System.out.println("armstrong");
		else
			System.out.println("not a armstrong");
		sc.close();
	}

}
