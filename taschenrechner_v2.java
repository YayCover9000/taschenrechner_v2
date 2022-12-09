import java.util.Scanner;
import java.lang.Math;

import javax.swing.plaf.basic.BasicRadioButtonUI;
public class taschenrechner_v2  {
    public static void main(String [] args) {

       Scanner sc = new Scanner(System.in);

        int bruttoKiloPreis;
        int gewicht;
        float bruttoPreis;
        final float MWST_SATZ;
        float nettoPreis;
        float mwstPreis;
        float gesamtPreis;
        float bruttoPreisEuro;
        float nettoPreisEuro;
        int gratisBanana = 0;
        int bananenRechnung;
        
        //Einlesen der Werte
        System.out.println("brutto Preis in Cent");
        bruttoKiloPreis = sc.nextInt();
        System.out.println("gewicht Eingabe in Gramm");
        gewicht = sc.nextInt();
        System.out.println("MwSt eingeben: ");
        MWST_SATZ = sc.nextShort();

        bruttoPreis = bruttoKiloPreis * gewicht / 1000.0f;
        nettoPreis = bruttoPreis / (1 + MWST_SATZ / 100);
        mwstPreis = nettoPreis * MWST_SATZ / 100;
        gesamtPreis = mwstPreis + nettoPreis;

        //Umrechnen in Euro
        bruttoPreisEuro = Math.round(bruttoPreis)/100f;
        nettoPreisEuro = Math.round(nettoPreis)/100f;
        mwstPreis = Math.round(mwstPreis)/100f;
        gesamtPreis = Math.round(gesamtPreis)/100f;


      /* if(gesamtPreis>=10 && gesamtPreis<15 || gesamtPreis>15 && gesamtPreis%5==0) {
            gratisBanana++;

        }*/
     if(gesamtPreis>=15){
      bananenRechnung = (int)gesamtPreis / 5 - 2;
      gratisBanana = bananenRechnung;
     }else if(gesamtPreis>=10){
         gratisBanana++;
     }


        //Kontrolle
        System.out.println("brutto Preis ist: " + bruttoPreisEuro +" Euro");
        System.out.println("netto Preis ist: " + nettoPreisEuro +" Euro");
        System.out.println("MwSt Preis ist: " + mwstPreis +" Euro");
        System.out.println("gesamt Preis ist: " + gesamtPreis +" Euro");
        System.out.println("gratis Banane: " + gratisBanana);
    }
}