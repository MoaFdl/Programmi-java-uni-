//javac Prova5.java    java Prova5
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;
import prog.utili.Frazione;

// oppure import prog.io.*;     ( più veloce ma è piu pesante )
public class Prova5{
	public static void main(String[] args)
	{
		int num,den;
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		 num=in.readInt("inserire numeratore\n");
		  den=in.readInt("inserire denominatore\n");
		  Frazione f = new Frazione(num,den);
		  out.print(f);
		   num=in.readInt("inserire numeratore\n");
		  den=in.readInt("inserire denominatore\n");
		   Frazione g = new Frazione(num,den);
		   out.print(g);
		   
		   
		   f= f.piu(g);
		   
		   
		out.print("\nil risultato e'\n"+f);
		
		
		
	}
}
