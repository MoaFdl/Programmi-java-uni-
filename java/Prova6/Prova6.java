//javac Prova6.java    java Prova6
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;


// oppure import prog.io.*;     ( più veloce ma è piu pesante )
public class Prova6{
	public static void main(String[] args)
	{
		String s;
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		 s=in.readLine("inserire stringa\n");
		 
		  out.print(s);
		  
		  s=s.toUpperCase();
		  
		  out.print("\n"+s);
		   
		   
		   
	
		
		
		
	}
}