package namudarbai;

import namudarbai.SportineMasina;

public class Objektai {

    public static void main(String[] args) {

        // ---------------- Namu darbas Zmogus ir Studentas -------------------
//
//        // Zmogus.
//    Zmogus zmogus = new Zmogus("Vidas", "Petrauskas");
//        System.out.println(zmogus.labas());
//        System.out.println("--------------");
//        
//        // Paprastas zmogus.
//    Zmogus paprastasZmogus = new Zmogus("Jonas", "Jonaitis");
//        System.out.println(paprastasZmogus.labas());
//        System.out.println("--------------");
//        
//        // Studentas.
//    Studentas studentas = new Studentas("Petras", "Petraitis", "Programavimas");
//        System.out.println(studentas.labas());
//        System.out.println(studentas.getKursoPavadinimas());
//
// *************************************************************************************
//      --------------- Namu darbas Masinyciu lenktynes ----------------------


        Masina[] masinos = {
            new Masina("Masina1", 80),
            new Masina("Masina2", 180),
            new Masina("Masina3", 140),
            new Masina("Masina4", 200),
            new Masina("Masina5", 230),
            new Masina("Masina6", 160),
            new Masina("Masina7", 100),
            new Masina("Masina8", 120)
        };

        boolean yraLaimetojas = false;
        int spausdinamKas100 = 100;
        int spoileris;
        int n;

        //Sportines masinos randomiser:
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                n = (int) (Math.random() * 4) + 1;
                masinos[n - 1] = new SportineMasina("Sportine1", 280);
            } else {
                n = (int) (Math.random() * 4) + 5;
                masinos[n - 1] = new SportineMasina("Sportine2", 300);
            }
        }

        while (!yraLaimetojas) {
            for (int i = 0; i < masinos.length; i++) {
                if (masinos[i] instanceof SportineMasina) {    //  (masinos[i].getMaxGreitis() == maxSportine)
                    spoileris = (int) (Math.random() * 2);
                    if (spoileris == 1) {
                       ((SportineMasina)masinos[i]).setSpoileris(true); 
                    }
                    if (spoileris == 0) {
                        ((SportineMasina)masinos[i]).setSpoileris(false); 
                    }
                }
                if (masinos[i].getKelias() >= spausdinamKas100) {
                    System.out.println("Lyderis po " + spausdinamKas100 + "km: " + masinos[i].getPavadinimas() + " " + masinos[i].getKelias() + "km");
                    spausdinamKas100 += 100;
                }
                if (masinos[i].getKelias() >= 1000) {
                    yraLaimetojas = true;
                } else {
                    double gazuotArStabdyt = (byte) Math.random();
                    if (gazuotArStabdyt < 0.8) {
                        int kiekGazuot = (int) (Math.random() * 10) + 1;
                        masinos[i].gazuok(kiekGazuot);
                        masinos[i].vaziuok();
                    } else {
                        int kiekStabdyt = (int) (Math.random() * 5) + 1;
                        masinos[i].stabdyk(kiekStabdyt);
                        masinos[i].vaziuok();
                    }
                }

            }
        }

        System.out.println("------------------------------");

        //Masinyciu rusiavimas po lenktyniu, pagal nuvaziuota kelia:
        Masina kintamasis;

        for (int i = 0; i < masinos.length; i++) {
            for (int j = i + 1; j < masinos.length; j++) {
                if (masinos[j].getKelias() > masinos[i].getKelias()) {

                    kintamasis = masinos[i];
                    masinos[i] = masinos[j];
                    masinos[j] = kintamasis;
                }
            }
        }

        for (int i = 0; i < masinos.length; i++) {
            if (i == 0) {
                System.out.println("LAIMETOJAS - " + masinos[i].getPavadinimas() + " " + masinos[i].getKelias() + "km");
            }
            System.out.println(masinos[i].getPavadinimas() + " " + masinos[i].getKelias() + "km");
        }

    }
}
