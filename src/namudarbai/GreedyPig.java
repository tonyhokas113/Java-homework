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
public class GreedyPig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robotai();
//
//        int skaicius = 0;
//        int zaidejoTaskai = 0;
//        int kasMetaKauliuka = 1;
//        int laikiniZaidejoTaskai = 0;
//        int taskaiPc1 = 0;
//        int laikiniPc1Taskai = 0;
//        int pc = 0;
//
//        System.out.println("*****************************");
//        System.out.println("        GREEDY PIG");
//        System.out.println("*****************************");
//        do {
//            System.out.println("");
//            System.out.println("     GALIMI PASIRINKIMAI: ");
//            System.out.println("-----------------------------");
//            System.out.println("     1. Ridenti kauliuka");
//            System.out.println("     2. Baigti ejima");
//            System.out.println("     0. Baigti zaidima");
//            System.out.println("-----------------------------");
//            System.out.print("Ivesk veiksmo numeri: ");
//            skaicius = sc.nextInt();
//            System.out.println("");
//            System.out.println("*****************************");
//
//            if (skaicius < 0) {
//                System.out.println("Ivesk teigiama skaiciu!!");
//                System.out.println("");
//                System.out.println("*****************************");
//            }
//            if (skaicius > 2) {
//                System.out.println("Ivedei per dideli skaiciu!!");
//                System.out.println("");
//                System.out.println("*****************************");
//            }
//            if (skaicius == 2) {
//                System.out.println("Pabaigei ejima");
//                zaidejoTaskai += laikiniZaidejoTaskai;
//                System.out.println("Tavo taskai: " + zaidejoTaskai);
//                System.out.println("*****************************");
//                System.out.println("");
//                kasMetaKauliuka++;
//            }
//
//            if (kasMetaKauliuka % 2 != 0 && skaicius == 1) {
//                int kauliukas = (int) (Math.random() * 6) + 1;
//                System.out.println("Isridenai: " + kauliukas);
//                if (kauliukas > 1) {
//                    laikiniZaidejoTaskai += kauliukas;
//                    System.out.println("Sio ejimo taskai: " + laikiniZaidejoTaskai);
//                    System.out.println("*****************************");
//                }
//                if (kauliukas == 1) {
//                    laikiniZaidejoTaskai = 0;
//                    System.out.println("Tavo ejimas baiges");
//                    System.out.println("Sio ejimo taskai sudege..");
//                    System.out.println("Tavo taskai: " + zaidejoTaskai);
//                    System.out.println("*****************************");
//                    System.out.println("");
//                    kasMetaKauliuka++;
//                }
//            }
//            while (kasMetaKauliuka % 2 == 0 && pc <= 5) {
//                pc++;
//                int kauliukas = (int) (Math.random() * 6) + 1;
//                System.out.println("Kompiuteris isrideno: " + kauliukas);
//                if (kauliukas > 1) {
//                    laikiniPc1Taskai += kauliukas;
//                    System.out.println("Sio ejimo kompiuterio taskai: " + laikiniPc1Taskai);
//                    System.out.println("*****************************");
//                }
//                if (kauliukas == 1) {
//                    laikiniPc1Taskai = 0;
//                    System.out.println("Kompiuterio ejimo taskai sudege..");
//                    System.out.println("Kompiuteris baige ejima");
//                    System.out.println("Kompiuterio taskai: " + taskaiPc1);
//                    System.out.println("*****************************");
//                    pc = 0;
//                    kasMetaKauliuka++;
//                }
//                if (pc == 5) {
//                    taskaiPc1 += laikiniPc1Taskai;
//                    laikiniPc1Taskai = 0;
//                    System.out.println("Kompiuteris baige ejima");
//                    System.out.println("Kompiuterio taskai: " + taskaiPc1);
//                    System.out.println("*****************************");
//                    pc = 0;
//                    kasMetaKauliuka++;
//                }
//            }
//        } while (skaicius != 0 && zaidejoTaskai < 100 && taskaiPc1 < 100);
//        if (skaicius == 0) {
//            System.out.println("Zaidimas baigtas");
//        }
//        if (zaidejoTaskai >= 100) {
//            System.out.println("Valioo tu laimejai!");
//        }
//                    if (taskaiPc1 >= 100) {
//                System.out.println("Laimejo kompiuteris..");
//            }

    }

    public static void Robotai() {

        int kasMetaKauliuka = 1;
        int taskaiPc1 = 0;
        int laikiniPc1Taskai = 0;
        int pc = 0;
        int taskaiPc2 = 0;
        int laikiniPc2Taskai = 0;
        
    do {
        while (kasMetaKauliuka % 2 != 0 && pc <= 5) {
            pc++;
            int kauliukas = (int) (Math.random() * 6) + 1;
            System.out.println("Pc1 isrideno: " + kauliukas);
            if (kauliukas > 1) {
                laikiniPc1Taskai += kauliukas;
            }
            if (kauliukas == 1) {
                laikiniPc1Taskai = 0;
                System.out.println("Pc1 taskai sudege..");
                System.out.println("Pc1 baige ejima");
                System.out.println("Pc1 taskai: " + taskaiPc1);
                System.out.println("*****************************");
                pc = 0;
                kasMetaKauliuka++;
            }
            if (pc == 5) {
                taskaiPc1 += laikiniPc1Taskai;
                laikiniPc1Taskai = 0;
                System.out.println("Pc1 baige ejima");
                System.out.println("Pc1 taskai: " + taskaiPc1);
                System.out.println("*****************************");
                pc = 0;
                kasMetaKauliuka++;
            }
        }
        
        while (kasMetaKauliuka % 2 == 0 && taskaiPc1 < 100) {
            int kauliukas = (int) (Math.random() * 6) + 1;
            System.out.println("Pc2 isrideno: " + kauliukas);
            if (kauliukas > 1) {
                laikiniPc2Taskai += kauliukas;
            }
            if (kauliukas == 1) {
                laikiniPc2Taskai = 0;
                System.out.println("Pc2 taskai sudege..");
                System.out.println("Pc2 baige ejima");
                System.out.println("Pc2 taskai: " + taskaiPc2);
                System.out.println("*****************************");
                kasMetaKauliuka++;
            }
            if (laikiniPc2Taskai >= 18) {
                taskaiPc2 += laikiniPc2Taskai;
                laikiniPc2Taskai = 0;
                System.out.println("Pc2 baige ejima");
                System.out.println("Pc2 taskai: " + taskaiPc2);
                System.out.println("*****************************");
                kasMetaKauliuka++;
            }
        }
    } while (taskaiPc1 < 100 && taskaiPc2 < 100);
        
        if (taskaiPc1 >= 100) {
            System.out.println("Laimejo Pc1");
        }
        if (taskaiPc2 >= 100) {
            System.out.println("Laimejo Pc2");
        }

    }
}


/*
    Greedy pig

    Zaidziama su vienu kauliuku 1..6

    Tikslas surinkti 100 tasku.

    zaidejas meta
        jei isrideno 2..6 gali ridenti dar karta
        jei isrideno 1 - to ejimo taskai nunulinami ir ejimas pereina kitam zaidejui
      zaidejas (jei isrideno 2..6) gali pasirinkti ar mesti dar karta
      ar pasiimti taskus ir perleisti ejima kitam zaidejui

    Z1          Z2
    10  10      0  0
    8   18      23 23
    0   18      9  32

    Z1:
    isrideno 3
    isrideno 5
    isrideno 2
    stop

    Z2:
    isrideno 6
    isrideno 1

    Z1:
    isrideno 4
    isrideno 4
    stop

    Z2:
    isrideno 6
    isrideno 5
    isrideno 6
    isrideno 6
    stop

    Z1:
    isrideno 1

    Z2:
    isrideno 3
    isrideno 2
    isrideno 4
    stop
 
    kol kuris nors is zaideju surenka 100


    Leisti zmogui pasirinkti ar ridenti ar sustoti

    Kompiuteris zaidzia:
    1. bando isridenti 5 kartus is eiles
    ***
    2. bando pasiekti 18 tasku

    ***************
    Tegu zaidzia kompiuteris su savim - 2 skirtingos strategijos

    comp1: 4 3 6 2 3 = 18 (18)
    comp2: 6 5 6 1 = 0 (0)
    comp1: 1 = 0 (18)
    comp2: 4 5 6 2 2 = 19 (19)
    comp1: 3 3 3 3 3 = 15 (33)
    ...
 */
