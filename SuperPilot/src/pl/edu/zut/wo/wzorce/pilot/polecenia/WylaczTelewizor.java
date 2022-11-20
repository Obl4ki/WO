package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.TV;

public class WylaczTelewizor implements Polecenie {
    TV telewizor;

    public WylaczTelewizor(TV telewizor) {
        super();
        this.telewizor = telewizor;
    }

    public void wykonaj() {
        telewizor.wyłącz();
    }

    public void wycofaj() {
        telewizor.włącz();

    }
}
