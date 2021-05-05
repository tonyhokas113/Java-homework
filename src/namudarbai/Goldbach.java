package namudarbai;

import java.util.Scanner;

public class Goldbach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nuo 4 iki ... ?");
        int repeat = sc.nextInt();
        System.out.println("------------------");

        int kiekKartuDalinas;
        int[] pirminiai = new int[repeat];
        int n = -1;

        for (int s = 2; s <= repeat; s++) {
            kiekKartuDalinas = 0;
            for (int p = 1; p <= s; p++) {
                if ((s % p) == 0) {
                    kiekKartuDalinas++;
                }
            }
            if (kiekKartuDalinas == 2) {
                pirminiai[n += 1] = s;
            }
        }

        for (int i = 4; i <= repeat; i+=2) {
            int printCount = 0;
                for (int m = 0; m < pirminiai.length; m++) {
                    for (int j = m; j < pirminiai.length; j++) {
                        if (pirminiai[m] + pirminiai[j] == i && printCount == 0) {
                            System.out.println(i + " = " + pirminiai[m] + " + " + pirminiai[j]);
                            printCount++;
                        }
                    }
                }
        }

        
    }


/*
    Bet koks LYGINIS skaicius gali buti uzrtasytas
    dvieju PIRMINIU skaiciu suma

4 = 2 + 2
6 = 3 + 3
8 = 3 + 5
10 = 5 + 5
12 = 5 + 7

    atspausdinti visu (lyginiu) skaiciu sudetines dalis
    uztenka vieno varianto
    intervale nuo 4..2000

    public static void main(String[] args) {
        for (int i = 4; i <= 2000; i++) {
            // 16 = 5 + 11
        }
    }

1 - nera pirminis



    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        System.out.println("4=2+2");
        for (int i = 6; i <= 500000; i += 2) {
            System.out.print(i);
            System.out.print("=");
            for (int j = 3; j < i; j += 2) {
                if (isPrime(j) && isPrime(i - j)) {
                    System.out.print(j);
                    System.out.print("+");
                    System.out.print(i - j);
                    break;
                }
            }
            System.out.println();
        }
    }
 */
}
