//javac ProvaQ4.java
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;
// oppure import prog.io.*;     ( più veloce ma è piu pesante )
public class ProvaQ4{
	public static void main(String[] args)
	{
		int x;
		String y;
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		y=in.readLine("inserire stringa\n");
		 x=in.readInt("inserire numero\n");
		out.print("hello world"+x+y);
		
	}
}