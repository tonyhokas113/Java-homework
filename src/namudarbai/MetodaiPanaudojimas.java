package namudarbai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodaiPanaudojimas extends ListMetodai {


    public static void main(String[] args) {
        
        List l = new ArrayList();
        
        ListMetodai metodai = new ListMetodai();
        
        metodai.fill(l, 10);
        System.out.println(l);
        System.out.println("---------------");
        System.out.println("Skaiciu vidurkis: " + metodai.fill(l));
        System.out.println("---------------");
        System.out.println("Didziausias skaicius: " + metodai.max(l));
        System.out.println("---------------");
        System.out.println("Maziausias skaicius: " + metodai.min(l));


    }
}
