package pl.edu.zut.wo.wzorce.symulator;

public class Kaczka {
    public LatanieInterfejs latanieInterfejs;
    public KwakanieInterfejs kwakanieInterfejs;

    void pływaj() {
    	System.out.println("Pływam jak kaczka.");
    }
    void wyświetl() {
    	System.out.println("Wyglądam jak kaczka.");
    }

    void lec() {
        latanieInterfejs.latanie();
    }

    void kwacz() {
        kwakanieInterfejs.kwacz();
    }
    
}
