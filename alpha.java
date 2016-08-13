import java.util.Scanner;

public class alpha_4 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=s.charAt(0);
		
		if(Character.isLetter(c))
		{
		System.out.println("It is a alphabet");
		}
		else
			System.out.println("It is not a alphabet");
		
		sc.close();

	}

}
