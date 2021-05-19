package namudarbai;

import java.util.ArrayList;
import java.util.List;

public class ListMetodai implements Metodai {

    @Override
    public void fill(List l, int count) {

        for (int i = 0; i < count; i++) {
            int r = (int) (Math.random() * 1000) + 1;
            l.add(r);
        }
    }

    @Override
    public double fill(List l) {

        double sum = 0;
        double avg = 0;
        for (int i = 0; i < l.size(); i++) {
            sum += (int) l.get(i);
            avg = sum / l.size();
        }
        return avg;
    }

    @Override
    public double max(List l) {

        double inMemory = 0;
        for (int i = 0; i < l.size(); i++) {
            if (inMemory < (int) l.get(i)) {
                inMemory = (int) l.get(i);
            }
        }
        return inMemory;
    }

    @Override
    public double min(List l) {
        
        double inMemory = (int) l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if (inMemory > (int) l.get(i)) {
                inMemory = (int) l.get(i);
            }
        }
        return inMemory;
    }

}


/*

sukurti metoda, kuris uzpildys duota lista nurodytu kiekiu elementu Math.random()

 

void fill(List l, int count);

 

sukurti metoda, kuris paskaiciuotu liste esanciu elementu vidurki
double fill(List l);

 

sukurti metoda, kuris surastu didziausia elementa
double max(List l);

 

sukurti metoda, kuris surastu maziausia elementa
double min(List l);

// Destytojo nd pvz:

    public static double avg(List l) {

        double sum = 0;
        for (int i = 0; i < l.size(); i++) {
            sum += (Double) l.get(i);
        }
        return sum / l.size();
    }
 
    public static double min(List l) {
        double m = Double.MAX_VALUE;
        for (int i = 0; i < l.size(); i++) {
            if (m > (Double) l.get(i)) {
                m = (Double) l.get(i);
            }
        }
        return m;
    }
 
    public static double max(List l) {
        double m = Double.MIN_VALUE;
        for (int i = 0; i < l.size(); i++) {
            if (m < (Double) l.get(i)) {
                m = (Double) l.get(i);
            }
        }
        return m;
    }

 
    public static void main(String[] args) {

        List l = new ArrayList();
        fill(l, 10);
        System.out.println(l);
        System.out.println(avg(l));
        System.out.println(min(l));
        System.out.println(max(l));

}

*/

