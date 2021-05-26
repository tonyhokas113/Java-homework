package namudarbai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SraigiuLenktynes extends Thread {

    public String sraige;
    public int atstumas;
    public long startLaikas;
    public long finishLaikas;
    private long lenktyniuLaikas;

    public SraigiuLenktynes(String sraige) {
        this.sraige = sraige;
    }

    @Override
    public void run() {

        Date data = new Date();
        startLaikas = data.getTime();

        int a = 50;

        while (atstumas < 1000) {
//            if (atstumas >= a) {
                System.out.println(sraige + ", Atstumas: " + atstumas);
//                a += 50;
//            }
            try {
                Thread.sleep((int) (Math.random() * 5) + 1);
            } catch (Exception ex) {
                //ignored
            }
            atstumas += (int) (Math.random() * 3) + 1;
            if (atstumas >= 1000) {
                Date data2 = new Date();
                finishLaikas = data2.getTime();
            }
        }
        System.out.println(sraige + ", Atstumas: " + atstumas);
        lenktyniuLaikas = finishLaikas - startLaikas;
    }

    @Override
    public String toString() {
        return "Lenktyniu laikas: " + lenktyniuLaikas + ", " + sraige + ", Atstumas " + atstumas + "\n";
    }
    
    public static void main(String[] args) {

        SraigiuLenktynes s1 = new SraigiuLenktynes("Sraige 1");
        SraigiuLenktynes s2 = new SraigiuLenktynes("Sraige 2");
        SraigiuLenktynes s3 = new SraigiuLenktynes("Sraige 3");
        SraigiuLenktynes s4 = new SraigiuLenktynes("Sraige 4");
        SraigiuLenktynes s5 = new SraigiuLenktynes("Sraige 5");
        SraigiuLenktynes s6 = new SraigiuLenktynes("Sraige 6");
        SraigiuLenktynes s7 = new SraigiuLenktynes("Sraige 7");
        SraigiuLenktynes s8 = new SraigiuLenktynes("Sraige 8");

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();

        try {
            s1.join();
            s2.join();
            s3.join();
            s4.join();
            s5.join();
            s6.join();
            s7.join();
            s8.join();
        } catch (InterruptedException ex) {
            //ignored
        }
     
        List<SraigiuLenktynes> sraiges = new ArrayList();

        sraiges.add(s1);
        sraiges.add(s2);
        sraiges.add(s3);
        sraiges.add(s4);
        sraiges.add(s5);
        sraiges.add(s6);
        sraiges.add(s7);
        sraiges.add(s8);
        
        class lygintojas<T extends SraigiuLenktynes> implements Comparator<T> {

            @Override
            public int compare (T o1, T o2) {
                Long x1 = (Long) o1.finishLaikas;
                Long x2 = (Long) o2.finishLaikas;
                return x1.compareTo(x2);
            }
        }
        
        Comparator c = new lygintojas();
        sraiges.sort(c);
        System.out.println("");
        System.out.println(sraiges);
    }
}    
    

/*

Sraigiu lenktynes
yra 8 sraiges
 
visos sraiges sliauzia 1000 cm
 
kiekviena sraige:
pasliauzia random nuo 1-3 cm ir
pamiega random nuo 1-5 ms
 
pabaigoj atspausdinti turnyrine lentele,
surusiuota pagal distancijos iveikimo greiti

lenktynes baigiasi kai visos sraiges finisuoja
 
*/
