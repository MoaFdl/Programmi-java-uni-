//per le librerie   import prog.postoFile.nomOggetto
import prog.utili.Frazione;
public class prov3
{
	public static void main(String[] args)//main
	/*
	first reaction shock
	*/
	/** commento in caso di java doc*/
	{
		
		
		
		//installare la libreria
		//fare le variabili
		//provare a fare i calcoli con gli oggetti
		
			
		
		

    Frazione f = new Frazione(5,2);
		Frazione g = new Frazione(3,2);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		
		Frazione ris = f.piu(g);
		f = f.piu(g);
		
		System.out.println("ris = " + ris);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		
		f = g;
		
		System.out.println("ris = " + ris);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		
		f = f.piu(g);
		
		System.out.println("ris = " + ris);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
    

		
	}
}