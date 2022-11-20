package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.DrzwiGarażu;

public class OtworzDrzwiGarazowe implements Polecenie {
    DrzwiGarażu drzwiGarażu;

    public OtworzDrzwiGarazowe(DrzwiGarażu drzwiGarażu) {
		super();
		this.drzwiGarażu = drzwiGarażu;
	}

    public void wykonaj() {
        drzwiGarażu.podnieś();
    }

    @Override
    public void wycofaj() {
        drzwiGarażu.opuść();
    }
}
