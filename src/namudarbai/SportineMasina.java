package namudarbai;

import namudarbai.Masina;

public class SportineMasina extends Masina {

    private boolean spoileris;

    public SportineMasina(String pavadinimas, int maxGreitis) {
        super(pavadinimas, maxGreitis);
    }

    public boolean isSpoileris() {
        return spoileris;
    }

    public void setSpoileris(boolean spoileris) {
        this.spoileris = spoileris;
    }

    public void gazuok(int kiek) {
        if (this.spoileris == false) {
            this.greitis += kiek * 2;
        }
    }

    public void stabdyk(int kiek) {
       if (this.spoileris == true) {
           this.greitis -= kiek * 2;
       }
    }

}

/*
Sukurti klase SportineMasina (paveldeta nuo Masina)
papildomai turi savybe:
spoileris (pakeltas - true/ nuleistas - false)
 
jei spoileris pakeltas - masina stabdo 2x greiciau
jei spoileris nuleistas- masina stabdo kaip eiline masina
 
jei spoileris pakeltas - masina gazuoja kaip eiline masina
jei spoileris nuleistas- masina gazuoja 2x greiciau
 
main:
lenktyniauja 6 paprastos ir 2 sportines masinos
kiekvieno ciklo metu
jei tai  yra sportine masina:
50/50 turi pakelti arba nuleist spoileri
 */
