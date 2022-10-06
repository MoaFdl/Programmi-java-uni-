//javac Prova0.java
import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Prova0{
	private static void runProcess(String command) throws Exception 
	  {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
      }
	   private static void printLines(String cmd, InputStream ins) throws Exception 
	{
        String line = null;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(ins));
        while ((line = in.readLine()) != null)
			{
            System.out.println(cmd + " " + line);
			}
    }

	public static void main(String[] args)
	{
		//s=in.readLine("inserire stringa\n");
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int x;
		out.print("\n-----------------------------------------------------\n");
		x= in.readInt("\nquale file vuoi aprire?\n");

		switch(x){
			case 1:
			out.print("hai scelto Prova1");
			
			 
			break;
			case 2:
			out.print("hai scelto Prova2");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 3:
			out.print("hai scelto Prova3");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 4:
			out.print("hai scelto Prova4");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 5:
			
			out.print("hai scelto Prova5");
			
			try 
			{
           
            System.out.println("**********");
            runProcess("javac Prova5.java");
            System.out.println("**********");
            runProcess("java   Prova5 ");
			} 
			catch (Exception e) 
			{
            e.printStackTrace();
			}
        
			
			 	out.print("\n-----------------------------------------------------\n");
			break;
			case 6:
			out.print("hai scelto Prova6");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 7:
			out.print("hai scelto Prova7");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 8:
			out.print("hai scelto Prova8");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 9:
			out.print("hai scelto Prova9");
				out.print("\n-----------------------------------------------------\n");
			break;
			case 10:
			out.print("hai scelto Prova10");
				out.print("\n-----------------------------------------------------\n");
			break;
			default :
			out.print("non esistente");
				out.print("\n-----------------------------------------------------\n");
			break;
			
			
		}
		
		//equals() per confrontare oggetti  come le frazioni
		
	}
}