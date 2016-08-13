import java.util.Scanner;

public class palim_no_12 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=String.valueOf(a);
		StringBuffer ss=new StringBuffer(s);
		ss=ss.reverse();
		
		
		if(s.equalsIgnoreCase(String.valueOf(ss)))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		
		
		sc.close();
		
	
	}

}
