//javac Prova7.java    java Prova7
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;
public class Prova7{
	public static void main(String[] args)
	{
		
		String s,s1,s2,s3,s4;
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.print("------------------------------------------------------");
		 s=in.readLine("inserire stringa\n");
		 s3 = in.readLine("inserire stringa3\n");
		  out.print(s);
		  
		  s1=s.toUpperCase();
		  
		  s2= s1.concat(s.concat(s3));
		  out.print("\n"+s2);
		  s4= s1 + s + s3;
		    out.print("\n"+s4);
		   out.print("\n lunghezza della stringa inserita=  " + s2.length() + "\n lunghezza2= " + s4.length() );
		 out.print("\n------------------------------------------------------");
		 
	}
}
/* ovearlonding= possibilità di avere piu metodi con stesso nome ma con segbatura diversa nella stessa classe
segnatura =nome metodo + lista  argomenti
prototipo= segnatura + tipo restituito 
*/
