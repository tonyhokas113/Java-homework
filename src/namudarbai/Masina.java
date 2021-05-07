
package namudarbai;


public class Masina {
    
    protected String pavadinimas;
    protected int maxGreitis;
    protected int kelias;
    protected int greitis;

    public Masina(String pavadinimas, int maxGreitis) {
        this.pavadinimas = pavadinimas;
        this.maxGreitis = maxGreitis;
    }
    
    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getMaxGreitis() {
        return maxGreitis;
    }

    public void setMaxGreitis(int maxGreitis) {
        this.maxGreitis = maxGreitis;
    }

    public int getKelias() {
        return kelias;
    }

    public void setKelias(int kelias) {
        this.kelias = kelias;
    }

    public int getGreitis() {
        return greitis;
    }

    public void setGreitis(int greitis) {
        this.greitis = greitis;
    }
    
    public void gazuok(int kiek) {
        this.greitis += kiek;
        if (this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }
    }
    
    public void stabdyk(int kiek) {
        this.greitis -= kiek;
        if (this.greitis < 0) {
            this.greitis = 0;
        }
    }
    
    public void vaziuok() {
        this.kelias += this.greitis;
    }
    
}


/*
Masinyciu lenktynes  
                                                 // i konstruktoriu reikia paduoti pavadinima ir greiti
Sukurti klase Masina su tokiom savybem:
pavadinimas (String)
maxGreitis (int)
kelias (int)
greitis (int)
metodai:
gazuok(kiek) - negali virsyti maxGreitis
stabdyk(kiek) - negali vaziuoti atbulai
vaziuok() - pavaziuoja tiek, koks siuo metu yra greitis
getteriai/setteriai (kur reikia)
 
main:
lenktynes (8 masinos)
kiekvieno ciklo metu
kiekvienai masinai nusprendziam ar ji gazuos (0.8) ar stabdys (0.2)
gazuoja 1..10
stabdo 1..5
kas 100 km atspausdinti lyderi
lenktynes baigiasi, kai kuri nors masina pasiekia 1000 km
 
surusiuoti visas masinas pagal nuvaziuota kelia
ir atspausdinti turnyrine lentele
 
*******
Sukurti klase SportineMasina (pavedeta nuo Masina)
papildomai turi savybe:
spoileris (pakeltas - true/ nuleistas - false)
 
jei spoileris pakeltas - masina stabdo 2x greiciau
jei spoileris nuleistas- masina stabdo kaip eiline masina
 
jei spoileris pakeltas - masina gazuoja kaip eiline masina
jei spoileris nuleistas- masina gazuoja 2x greiciau
 
main:
lenktyniauja 6 paprastos ir 2 sportine masinos
kiekvieno ciklo metu
jei tai  yra sportine masina:
50/50 turi pakelti arba nuleist spoileri
*/