/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namudarbai;

import java.util.Scanner;

/**
 *
 * @author Vaigaudas
 */
public class Pamarskomu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int skaicius;
       
        System.out.println("*****************************");
        System.out.println(" AKMUO - POPIERIUS - ZIRKLES ");
        System.out.println("*****************************");
        System.out.println("");
        System.out.println("    GALIMI PASIRINKIMAI: ");
        System.out.println("-----------------------------");
        do {
        System.out.println("      1. Akmuo");
        System.out.println("      2. Popierius");
        System.out.println("      3. Zirkles");
        System.out.println("      0. Baigti zaidima");
        System.out.println("-----------------------------");
        System.out.println("Pasirink skaiciu nuo 1 iki 3:");
        skaicius = sc.nextInt();
        System.out.println("-----------------------------");
        
        if (skaicius > 3 || skaicius < 0) {
            System.out.println("Skaicius turi buti tarp 1 ir 3..");
            System.out.println("Bandyk dar karta");
            System.out.println("-----------------------------");
        }
        
        int kompiuterioPasirinkimas = (int) (Math.random() * 3) + 1;
        
        if (skaicius == kompiuterioPasirinkimas) {
            System.out.println("Lygiosios");
            System.out.println("-----------------------------");
        }
        switch (skaicius) {
            case 1:
            {
                if (kompiuterioPasirinkimas == 2) {
                    System.out.println("Laimejo kompiuteris");
                    System.out.println("-----------------------------");
                }
                if (kompiuterioPasirinkimas == 3) {
                    System.out.println("Tu laimejai");
                    System.out.println("-----------------------------");
                }
            }
                break;
            case 2:
            {
                if (kompiuterioPasirinkimas == 1) {
                    System.out.println("Tu laimejai");
                    System.out.println("-----------------------------");
                    
                }
                if (kompiuterioPasirinkimas == 3) {
                    System.out.println("Laimejo kompiuteris");
                    System.out.println("-----------------------------");
                }
            }
                break;
            case 3:
            {
                if (kompiuterioPasirinkimas == 1) {
                    System.out.println("Laimejo kompiuteris");
                    System.out.println("-----------------------------");
                }
                if (kompiuterioPasirinkimas == 2) {
                    System.out.println("Tu laimejai");
                    System.out.println("-----------------------------");
                }
            }
                break;
        }
        
        if (skaicius == 0) {
            System.out.println("Zaidimas baigtas");
        }
        
    } while (skaicius != 0);

//   ******************************************************************************  
//   PC VS PC
//   ****************************************************************************** 

kompasSuKompu();

    }
    
public static void kompasSuKompu () {
    Scanner sc = new Scanner(System.in);

//    int skaicius;
//
//    System.out.println("*****************************");
//    System.out.println(" AKMUO - POPIERIUS - ZIRKLES ");
//    System.out.println("*****************************");
//    System.out.println("");
//    System.out.println("    GALIMI PASIRINKIMAI: ");
//    System.out.println("-----------------------------");
//    System.out.println("      1. Akmuo");
//    System.out.println("      2. Popierius");
//    System.out.println("      3. Zirkles");
//    System.out.println("      0. Baigti zaidima");
//    System.out.println("-----------------------------");
//    System.out.println("Kiek kartu reikia suzaisti:");
//    skaicius = sc.nextInt();
//    System.out.println("-----------------------------");
//
//        int lygiosios = 0;
//        int laimejoPc1 = 0;
//        int laimejoPc2 = 0;
//        
//        int akmuoPc1 = 0;
//        int popieriusPc1 = 0;
//        int zirklesPc1 = 0;
//        
//        int akmuoPc2 = 0;
//        int popieriusPc2 = 0;
//        int zirklesPc2 = 0;
//
//    for (int i = 1; i <= skaicius; i++) {
//
//        int pc1 = (int) (Math.random() * 3) + 1;
//        int pc2 = (int) (Math.random() * 3) + 1;
//
//        if (pc1 == pc2) {
//            lygiosios++;
//        }
//
//        switch (pc2) {
//            case 1:
//            {
//                if (pc1 == 2) {
//                    laimejoPc1++;
//                }
//                if (pc1 == 3) {
//                    laimejoPc2++;
//                }
//                akmuoPc2++;
//            }
//                break;
//            case 2:
//            {
//                if (pc1 == 1) {
//                    laimejoPc2++;
//                }
//                if (pc1 == 3) {
//                    laimejoPc1++; 
//                }
//                popieriusPc2++;
//            }
//                break;
//            case 3:
//            {
//                if (pc1 == 1) {
//                    laimejoPc1++;
//                }
//                if (pc1 == 2) {
//                    laimejoPc2++;
//                }
//                zirklesPc2++;
//            }
//                break;
//        }
//                
//        switch (pc1) {
//            case 1:
//                akmuoPc1++;
//                break;
//            case 2:
//                popieriusPc1++;
//                break;
//            case 3:
//                zirklesPc1++;
//                break;
//        }
//    }
//    
//    if (skaicius < 0) {
//        System.out.println("Reikia ivesti teigiama skaiciu");
//    }
//    else {
//    System.out.print("Pc1 laimejo: ");
//    System.out.println(laimejoPc1);
//    System.out.print("Pc2 laimejo: ");
//    System.out.println(laimejoPc2);
//    System.out.print("Lygiosios: ");
//    System.out.println(lygiosios);
//    
//    System.out.println("-----------------------------");
//    
//    System.out.println("Pc1: ");
//    System.out.print("Pasirinko akmeni:");
//    System.out.println(akmuoPc1);
//    System.out.print("Pasirinko popieriu:");
//    System.out.println(popieriusPc1);
//    System.out.print("Pasirinko zirkles: ");
//    System.out.println(zirklesPc1);
//    
//    System.out.println("-----------------------------");
//    
//    System.out.println("Pc2: ");
//    System.out.print("Pasirinko akmeni:");
//    System.out.println(akmuoPc2);
//    System.out.print("Pasirinko popieriu:");
//    System.out.println(popieriusPc2);
//    System.out.print("Pasirinko zirkles: ");
//    System.out.println(zirklesPc2);
//    }
}
    
    
}
/*

    Akmuo - popierius - zirkles

    Programa leidzia vartotojui pasirinkti:

    1. Akmuo
    2. Popierius
    3. Zirkles
    0. Pabaiga

    Jei ne pabaiga:
    Kompiuteris atsitiktinai pasirenka
    palyginam ir parasom kas laimejo

    ir vel spausdinam meniu
    jei vartotojas pasirinko ne 0..3 - pavadinikit vartotjoa mulkiu ir vel meniu

    ****
    Programa paklausia kiek kartu reikia suzaist

    Kompiuteris zaidzia su savim

    Pabaigoj atsapausdinti statistika:

    comp1 laimejo: XXXX
    comp2 laimejo: XXXX
    lygiosios: XXXX

    comp1:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX

    comp2:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX

*/