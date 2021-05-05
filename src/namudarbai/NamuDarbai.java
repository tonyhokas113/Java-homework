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
public class NamuDarbai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Ivesk pirma skaiciu");
//        int sk1 = sc.nextInt();
//        
//        System.out.println("Ivesk antra skaiciu");
//        int sk2 =sc.nextInt();
//        
//        System.out.println("Ivesk trecia skaiciu");
//        int sk3 = sc.nextInt();
//        
//        System.out.println("Ivesk ketvirta skaiciu");
//        int sk4 =sc.nextInt();
//        
//        System.out.println("Skaiciu vidurkis");
//        int suma = sk1 + sk2 + sk3 + sk4;
//        doube vidurkis = suma / 4.0;
//        System.out.println(vidurkis);
//        
//        **************************************************

//        System.out.println("Ivesk A tasko x kordinate");
//        int Ax = sc.nextInt();
//        System.out.println("Ivesk A tasko y kordinate");
//        int Ay = sc.nextInt();
//        System.out.println("Ivesk B tasko x kordinate");
//        int Bx = sc.nextInt();
//        System.out.println("Ivesk B tasko y kordinate");
//        int By = sc.nextInt();
//        System.out.println("Ivesk C tasko x kordinate");
//        int Cx = sc.nextInt();
//        System.out.println("Ivesk C tasko y kordinate");
//        int Cy = sc.nextInt();
//
//        double lengthAB = Math.sqrt((Bx - Ax) * (Bx - Ax)) + ((By - Ay) * (By - Ay));
//        System.out.println("AB krastines ilgis: " + lengthAB);
//
//        double lengthBC = Math.sqrt((Bx - Cx) * (Bx - Cx)) + ((By - Cy) * (By - Cy));
//        System.out.println("BC krastines ilgis: " + lengthBC);
//        
//        double lengthAC = Math.sqrt((Cx - Ax) * (Cx - Ax)) + ((Cy - Ay) * (Cy - Ay));
//        System.out.println("AC krastines ilgis: " + lengthAC);
//        
//        double perimeter = lengthAB + lengthBC + lengthAC;
//        System.out.println("Trikampio perimetras: " + perimeter);

 
            //Destytojo pavizdys
//        System.out.println("Ivesk x1 skaiciu:");
//        int x1 = sc.nextInt();
//        System.out.println("Ivesk y1 skaiciu:");
//        int y1 = sc.nextInt();
//        System.out.println("Ivesk x2 skaiciu:");
//        int x2 = sc.nextInt();
//        System.out.println("Ivesk y2 skaiciu:");
//        int y2 = sc.nextInt();
//        System.out.println("Ivesk x3 skaiciu:");
//        int x3 = sc.nextInt();
//        System.out.println("Ivesk y3 skaiciu:");
//        int y3 = sc.nextInt();
// 
//        double k1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
//        double k2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
//        double k3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
// 
//
//        System.out.println(k1 + k2 + k3);
// ***************************************************************************
//        
//        System.out.println("Iveskite pirma skaiciu");
//        int sk1 = sc.nextInt();
//        System.out.println("Iveskite antra skaiciu");
//        int sk2 = sc.nextInt();
//        System.out.println("-------------------------");
//        
//        int interval = Math.abs(sk1 - sk2);
//        int result = 0;
//        int i = 0;
//        
//      while(i <= interval) {
//          if(sk1 < sk2) {
//              result += sk1++;
//          }
//          else {
//              result += sk2++;
//          }
//              i++;
//      }
//      System.out.println(result);
//
//              option 2:
////       
//        System.out.print("Ivesk sk nuo:");
//        int nuo = sc.nextInt();
//        System.out.print("Ivesk sk iki:");
//        int iki = sc.nextInt();
//
//        if (nuo > iki) {
//            int tmp = iki;
//            iki = nuo;
//            nuo = tmp;
//        }
//
//        int suma = 0;
//
//        while (nuo <= iki) {
//            suma += nuo;
//            nuo++;
//        }
//
//        System.out.println(suma);
//
//**********************************************************************
//
//        System.out.println("Iveskite pirma skaiciu");
//        int sk1 = sc.nextInt();
//        System.out.println("Iveskite antra skaiciu");
//        int sk2 = sc.nextInt();
//        System.out.println("-------------------------");
//        
//        int interval = sk1 > sk2 ? sk1 : sk2;
//        int startNumber = sk1 > sk2 ? sk2 : sk1;
//        for(int i = startNumber; i <= interval; i++){
//            if(i % 2 != 0) {
//                System.out.println(i);
//                }
//            }
                    //option 2:
//                    
//        System.out.print("Ivesk sk nuo:");
//        int nuo = sc.nextInt();
//        System.out.print("Ivesk sk iki:");
//        int iki = sc.nextInt();
//
//        if (nuo > iki) {
//            int tmp = iki;
//            iki = nuo;
//            nuo = tmp;
//        }
//
//        while (nuo <= iki) {
//            if (nuo % 2 != 0) {
//                System.out.println(nuo);
//            }
//            nuo++;
//        }       
//
//      *******************************************************************
//
//        System.out.println("Iveskite pirma skaiciu");
//        int sk1 = sc.nextInt();
//        System.out.println("Iveskite antra skaiciu");
//        int sk2 = sc.nextInt();
//        System.out.println("-------------------------");
//        
//        int interval = Math.abs(sk1 - sk2);
//        int big = sk1 > sk2 ? sk1 : sk2;
//        int small = sk1 > sk2 ? sk2 : sk1;
//        int i = 0;
//        int result = 0;
//        
//        while(i <= interval) {
//            while(small < big){
//                result = small * small;
//                small++;
//            }
//            i++;
//        }
//        System.out.println(result);
//
                               //option 2 :
//                               
//        System.out.print("Ivesk sk nuo:");
//        int nuo = sc.nextInt();
//        System.out.print("Ivesk sk iki:");
//        int iki = sc.nextInt();
//
//        if (nuo > iki) {
//            int tmp = iki;
//            iki = nuo;
//            nuo = tmp;
//        }
//
//        int y = nuo;
//        while (y <= iki) {
//            int x = nuo;
//            while (x <= iki) {
//                System.out.print(x * y);
//                System.out.print("\t");
//                x++;
//            }
//            System.out.println();
//            y++;
//        }                          
//        
//        *********************************************************************
//                
//        int[] masyvas = {123, -1, 5, -7};
//        
//        for (int i = 0; i < masyvas.length; i++) {
//             for (int j = i + 1; j < masyvas.length; j++) {
//        
//            if(masyvas[i] > masyvas[j]){
//            int tmp = masyvas[i];
//            masyvas[i] = masyvas[j];
//            masyvas[j] = tmp;
//                }
//            }
//            System.out.println(masyvas[i]);
//        }
//        System.out.println("----------------------");
//        
//        for (int i = 0; i < masyvas.length; i++) {
//          for (int j = i + 1; j < masyvas.length; j++) {
//
//          if(masyvas[i] < masyvas[j]){
//          int tmp = masyvas[i];
//          masyvas[i] = masyvas[j];
//          masyvas[j] = tmp;
//              }
//          }
//          System.out.println(masyvas[i]);
//      }
//        ****************************************************************

        int[] cars = new int[8];
        
        boolean baigem = false;
        
        do {
        for(int i = 0; i < cars.length; i++){
            cars[i] += (int) (Math.random() * 5) + 1;
        }
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] > 1000){
                baigem = true;
            }
        }
        } while (!baigem);
        System.out.println("");
    //option 2:
//    
//        int[] masinytes = new int[8];
// 
//        int laimetojas = -1;
//        int n = 1;
//        do {
//            int lyderis = 0;
//            for (int i = 0; i < masinytes.length; i++) {
//                masinytes[i] += (int) (Math.random() * 5) + 1;
//                if (masinytes[i] > masinytes[lyderis]) {
//                    lyderis = i;
//                }
//            }
//            if (masinytes[lyderis] / 100 >= n) {
//                System.out.println(lyderis);
//                System.out.println(masinytes[lyderis]);
//                System.out.println("----");
//                n++;
//            }
//            for (int i = 0; i < masinytes.length; i++) {
//                if (masinytes[i] > 1000) {
//                    if (laimetojas < 0 || masinytes[laimetojas] < masinytes[i]) {
//                        laimetojas = i;
//                    }
//                }
//            }
//        } while (laimetojas == -1);
//        System.out.println("pabaiga");
//        for (int i = 0; i < masinytes.length; i++) {
//            System.out.println(masinytes[i]);
//        }
//        System.out.println("laimetojas");
//        System.out.println(laimetojas);
//        System.out.println(masinytes[laimetojas]);
// 
}
//    Namu darbas:
//    ivesti 4 skaicius ir atspausdinti ju aritmetini vidurki
//    ivesti triju tasku x ir y
//    paskaiciuoti susidariusio trikampio perimetra
//    ------------------------------------------------------
//    ivesti triju tasku x ir y
//    paskaiciuoti susidariusio trikampio perimetra
//           double sk = 100;
//        sk = Math.sqrt(sk);
//        System.out.println(sk);
//    --------------------------------------------------------
//    ivesti 2 skaicius ir atspausdinti
//    visu skaiciu esanciu tame intervale suma
//      3 6 -> 3+4+5+6 = 18
//      6 3 -> 3 + 4+ 5+6 =18
//    --------------------------------------------------------
//    ivesti du skaicius ir atsausdinti visus 
//    nelyginius skaicius esancius tame intervale
//    2 9 -> 3 5 7 9
//    10 7 -> 7 9
//    --------------------------------------------------------
//    ivesti du skaicius ir atspausdinti daugybos lentele
//    3 5 ->
//    9 12 15
//    12 16 20
//    15 20 25
//    --------------------------------------------------------
//         int[] masyvas = {123, -1, 5, -7};
//
// 
//
//        // surusiuoti masyvo elementus didejimo tvarka
//        // {-7, -1, 5, 123}
//        
//        for (int i = 0; i < masyvas.length; i++) {
//            System.out.println(masyvas[i]);
//        }
//
// 
//
//        // surusiuoti masyvo elementus mazejimo tvarka
//        // {123, 5, -1, -7}
//
// 
//
//        for (int i = 0; i < masyvas.length; i++) {
//            System.out.println(masyvas[i]);
//        }
//      ---------------------------------------------------------
//      
//              Masinyciu lenktynes:
//        turim 8 masinas
//       
//        kieviena masina per karta gali pavaziuoti 1..5 km
//        per viena cikla visos masinos pavaziuoja
//       
//        lenktynes baigiasi, kai bent viena masina nuvaziuoja 1000 km
//       
//        **
//        kas 100 km spausdinti pirmaujancios masinos numeri
//        **
//       
//        pabaigoj atspausdinti laimejusios masinos numeri ir nuvaziuota atstuma
//    -----------------------------------------------------------------------------

    
    
}
