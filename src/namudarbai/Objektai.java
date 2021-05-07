
package namudarbai;


public class Objektai {
    public static void main(String[] args) {
        
        // Zmogus.
    Zmogus zmogus = new Zmogus("Vidas", "Petrauskas");
        System.out.println(zmogus.labas());
        System.out.println("--------------");
        
        // Paprastas zmogus.
    Zmogus paprastasZmogus = new Zmogus("Jonas", "Jonaitis");
        System.out.println(paprastasZmogus.labas());
        System.out.println("--------------");
        
        // Studentas.
    Studentas studentas = new Studentas("Petras", "Petraitis", "Programavimas");
        System.out.println(studentas.labas());
        System.out.println(studentas.getKursoPavadinimas());
    }
}
