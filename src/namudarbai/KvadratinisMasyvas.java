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
public class KvadratinisMasyvas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
//    int[] m = {1, 2, 3, 4, 5};
//    int i,j;
//    
//    for (i = 0; i < m.length; i++) {                 
//        for (j = i; j < m.length; j++) {              
//            System.out.print(m[j]);
//            System.out.print("  ");
//        }
//        for (j = 0; j <= i - 1; j++){              
//            System.out.print(m[j]);
//            System.out.print("  ");
//        }
//    System.out.println();
//    }
//----------------------------------------------
//    int[] m = {1, 2, 3, 4, 5};
//    int[][] kvadratas = new int[m.length][m.length];
//
//
//    for (int i = 0; i< kvadratas.length;i++){
//        for( int a = 0; a < kvadratas[i].length; a++ ){
//
//            if(i + a < m.length) {
//                kvadratas[i][a] = m[i + a];
//            }else{
//                kvadratas[i][a] = m[i + a - m.length];
//            }
//        }
//    }
//
//    for (int i = 0; i< kvadratas.length;i++){
//        for( int a = 0; a < kvadratas[i].length; a++ ){
//            System.out.print(kvadratas[i][a]+ " ");
//        }
//        System.out.println();
//    }
//-------------------------------------------
//        int[] m = {1, 2, 3};
//        int[][] kv = new int[m.length][m.length];
// 
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m.length; j++) {
//                kv[i][(j + i) % m.length] = m[j];
//            }
//        }
//        for (int i = 0; i < kv.length; i++) {
//            for (int j = 0; j < kv[i].length; j++) {
//                System.out.print(kv[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println("------");
//
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m.length; j++) {
//                kv[i][j] = m[(j + i) % m.length];
//            }
//        }
//        for (int i = 0; i < kv.length; i++) {
//            for (int j = 0; j < kv[i].length; j++) {
//                System.out.print(kv[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
// -----------------------------------------------
//
//    int[] m = {1, 2, 3, 4, 5};
//    int i,j;
//    
//    for (i = 0; i < m.length; i++) {                 
//        for (j = 4 - i; j >= 5 - i; j++){              
//            System.out.print(m[j]);
//            System.out.print("  ");
//        }
//            for (j = 0; j < m.length - i; j++) {              
//            System.out.print(m[j]);
//            System.out.print("  ");
//        }
//    System.out.println();
//    }
//       
//  --------------------------------------------
//    int[][] m = {
//        {1, 2, 3, 4, 5},
//        {2, 3, 4, 5, 1},
//        {3, 4, 5, 1, 2},
//        {4, 5, 1, 2, 3},
//        {5, 1, 2, 3, 4},
//    };
//    
//           for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j]);
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//  --------------------------------------------
//    int[][] m = {
//        {1, 2, 3, 4, 5},
//        {5, 1, 2, 3, 4},
//        {4, 5, 1, 2, 3},
//        {3, 4, 5, 1, 2},
//        {2, 3, 4, 5, 1},
//    };
//    
//           for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j]);
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
}
    
/*
    
     int[] m = {1, 2, 3, 4, 5};
        
        sukurti kvadratini masyva,
        kurio eiluciu kiekis lygus duoto masyvo elementu kiekiui
       
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        2, 3, 4, 5, 1
        3, 4, 5, 1, 2
        4, 5, 1, 2, 3
        5, 1, 2, 3, 4
        atspausdinti
       
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        5, 1, 2, 3, 4
        4, 5, 1, 2, 3
        3, 4, 5, 1, 2
        2, 3, 4, 5, 1
        atspausdinti

*/
    
}