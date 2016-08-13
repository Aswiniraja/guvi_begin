import java.util.Scanner;

public class vowel 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=s.charAt(0);
		
		if(Character.isLetter(c))
		{
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println("vowel");
		else
			System.out.println("consonant");
		}
		else
			System.out.println("invalid");
		
		sc.close();

	}

}
