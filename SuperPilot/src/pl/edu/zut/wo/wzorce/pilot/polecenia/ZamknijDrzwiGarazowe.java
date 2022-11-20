package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarażu;

public class ZamknijDrzwiGarazowe implements Polecenie {
    DrzwiGarażu drzwiGarażu;

    public ZamknijDrzwiGarazowe(DrzwiGarażu drzwiGarażu) {
        super();
        this.drzwiGarażu = drzwiGarażu;
    }

    public void wykonaj() {
        drzwiGarażu.opuść();
    }

    @Override
    public void wycofaj() {
        drzwiGarażu.podnieś();
    }
}
