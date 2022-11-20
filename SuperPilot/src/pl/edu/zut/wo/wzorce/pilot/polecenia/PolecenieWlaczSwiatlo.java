package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Swiatlo;

public class PolecenieWlaczSwiatlo implements Polecenie {
	Swiatlo światło;

	public PolecenieWlaczSwiatlo(Swiatlo światło) {
		super();
		this.światło = światło;
	}

	public void wykonaj() {
		światło.włącz();
	}

	@Override
	public void wycofaj() {
		światło.wyłącz();
	}
}
