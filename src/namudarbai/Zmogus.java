
package namudarbai;


public class Zmogus {
    
    protected String vardas;
    protected String pavarde;
    
    public Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
    
    public String labas() {
        String labas = "Labas, as esu " + this.vardas + " " + this.pavarde + ".";
        return labas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
    
 
}

/*
sukurti klase Zmogus
zmogus turi varda ir pavarde
zmogus moka pasakyti labas -> Labas, as esu vardas pavarde
getter'iai/setter'iai
 
sukurti klase Studentas paveldeta nuo Zmogus
studentas papildomai turi kurso pavadinima
getter'iai/setter'iai
 
sukurti paprasta zmogu (Jonas, Jonaitis)
zmogus pasako labas()
 
sukurti studenta (Petras, Petraitis, programavimas)
studentas pasako labas()
atspausdinti studento kursa

***
kai studentas sako labas() - Labas, as esu studentas vardas pavarde

*/