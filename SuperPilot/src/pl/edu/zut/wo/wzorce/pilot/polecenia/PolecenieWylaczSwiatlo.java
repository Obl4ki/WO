package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;

public class PolecenieWylaczSwiatlo implements Polecenie {
	Swiatlo światło;

	public PolecenieWylaczSwiatlo(Swiatlo światło) {
		super();
		this.światło = światło;
	}

	public void wykonaj() {
		światło.wyłącz();
	}

	@Override
	public void wycofaj() {
		światło.włącz();
	}
}
