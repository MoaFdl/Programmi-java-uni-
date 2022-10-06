//javac Prova10.java
// programma che rende i caratteri dispari di una stringa maiuscoli
import java.util.Scanner;

public class Prova10{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\ninserisci stringa\n");
		String s = in.nextLine();
		String ris ="";
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(i%2==0)
			{
				c = Character.toLowerCase(c);
			}
			else
			{
				c = Character.toUpperCase(c);
			}
			ris+=c;
		}
		System.out.println("stato attuale\t" + ris );
		
		
	}
}