
package namudarbai;

import java.util.Scanner;


public class TrikampioPlotas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Iveskite pirmos krastines ilgi:");
        double pirma = sc.nextDouble();
        System.out.println("Iveskite pirmos krastines ilgi:");
        double antra = sc.nextDouble();
        System.out.println("Iveskite pirmos krastines ilgi:");
        double trecia = sc.nextDouble();
        
        if (pirma < 0 || antra < 0 || trecia < 0) {
           System.out.println("Iveskite teigiamus krastiniu ilgius");
        } else {
            double atsakymas = trikampioPlotas(pirma, antra, trecia);
            System.out.print("Trikampio plotas: ");
            System.out.println(atsakymas);
        }
            
    }
    
    public static double trikampioPlotas(double pirma, double antra, double trecia) {
        
        double pa = pirma + antra;
        double at = antra + trecia;
        double pt = pirma + trecia;
        
        if (pirma > at || antra > pt || trecia > pa) {
            return -1.0;
        } else {
            double p = (pirma + antra + trecia) / 2;
            double plotas = Math.sqrt(p * (p - pirma) * (p - antra) * (p - trecia));
            return plotas;
        }
      
    }
}

    
    /*
    sukurti metoda trikampio ploto paskaiciavimui (Herono formule)
    i metoda paduodami 3 karstiniu ilgiai (visi double)
    metodas grazina double

    jei trikampis nesusidaro - metodas turi grazinti -1.0

    Math.sqrt(___) - istraukia kvadratine sakni

    https://lt.wikibooks.org/wiki/Herono_formul%C4%97

    patikrinti:
    normalus trikampis 3, 4, 5 *
    ne trikampis 3, 14, 5 *
    neigiami ilgiai -3, 2, 7 *
    */
    