//javac Prova11.java
// programma che verifica se una parola è palindroma
import java.util.Scanner;

public class Prova11{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\ninserisci stringa\n");
		String s = in.nextLine();
		String ris ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c= s.charAt(i);
			
			ris+=c;
		}
		if(s.equals(ris) )
		{
			System.out.println("palindromo" );
		}
			
		else
		{
			System.out.println("non è palindroma" );
		}
		
		
	}
}