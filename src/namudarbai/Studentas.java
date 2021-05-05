
package namudarbai;


public class Studentas extends Zmogus {
    
    private String kursoPavadinimas;
    
    public Studentas(String vardas, String pavarde, String kursoPavadinimas) {
        super(vardas, pavarde);
        this.kursoPavadinimas = kursoPavadinimas;
    }

    public String getKursoPavadinimas() {
        return kursoPavadinimas;
    }

    public void setKursoPavadinimas(String kursoPavadinimas) {
        this.kursoPavadinimas = kursoPavadinimas;
    }
    
}
