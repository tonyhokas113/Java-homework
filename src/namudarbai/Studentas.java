
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
   
    public String labas() {
        String labas = "Labas, as esu " + this.vardas + " " + this.pavarde + kursoPavadinimas + ".";
        return labas;
    }
    
}


/*
    public void labas() {
        System.out.println("Labas, as esu studentas " +
                this.getVardas() + " " +
                this.getPavarde() + " mokausi " +
                this.kursas);
    }
*/