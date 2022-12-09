import java.util.Scanner;
import java.lang.Math;

public class taschenrechner_v1 {
	public static void main(String args[]) {
		//Einlesen User Imput
		Scanner input = new Scanner(System.in);

		System.out.println("Brutto-Kilo-Preis in Cent: ");
		int kilopreis = input.nextInt();
		System.out.println("Gewicht-in-Gramm: ");
		int gewicht = input.nextInt();


		System.out.println("\tCheck Kilopreis: " + kilopreis);
		System.out.println("\tCheck Gewicht in Gramm: " + gewicht);

		//Berechnungen
		int bruttorounded; //int erstellt
		float bruttoToRound = (gewicht / 1000.0f * kilopreis / 100.0f); // rechnung in float gespeichert  in einem float
		bruttorounded = Math.round(bruttoToRound); /* übergebe der Methode Math.round ein float welches dann in einem int 
		gespeicher wird. (Int = bruttorounded wird zu float = bruttoToRound */
		System.out.println("BruttoRounded: " + bruttoToRound + "Euro: "); // Ausgabe des in wertes (der vorher ein Float war


		//Mehrwertsteuer
		int mwstrounded; // int erstellt
		float mehrwertsteuer = (bruttoToRound * (7.0f / 100.0f)); // float erstellt, dem den Wert bruttoToRound * "Prozent" in Float format
		mwstrounded = Math.round(mehrwertsteuer); // dem Int wert einen Float wert zuordnen der in der Methode Math.round bearbeitet wurde / nur als zwischenspeicher 
		
		//rundungsspaß von netto hier in einzelnen Schritten
		/*mehrwertsteuer = (int)(mehrwertsteuer);
		mehrwertsteuer = (float)(mehrwertsteuer*100);
		mehrwertsteuer = (float)(mehrwertsteuer/100.0);*/
		
		mehrwertsteuer = (float)(((int)(mehrwertsteuer*100))/100.0); 
		
		System.out.println("Mehrwertsteuer in Cent: " + mehrwertsteuer); // Ausgabe Variable float



		//Netto
		int nettorounded; // int erstellt
		float nettoToRouned = (bruttoToRound - mehrwertsteuer); // float erstellt
		
		// War ein Rundungsversuch /nettoToRouned = (float)(nettoToRouned + 0.005);
		
		nettorounded = Math.round(nettoToRouned);
		
		/*rundungsversuch nettoToRouned = (int)(nettoToRouned + 100);
		nettoToRouned = nettoToRouned / 100; */
		
		nettoToRouned = (float)(((int)(nettoToRouned*100))/100.0); //YIPPHY das Rundet und klappt
		
		System.out.println("Netto: " + nettoToRouned + "Euro: "); //  netto rounded ausgeben
	}
}

/*

		//Ausgabe
		System.out.println("Bruttopreis: " + bruttopreisround + "Euro");
		System.out.println(1<2);

	}
}

/*	b=n+(n*7/100)
 */