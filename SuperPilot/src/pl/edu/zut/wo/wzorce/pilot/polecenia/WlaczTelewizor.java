package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.TV;

public class WlaczTelewizor implements Polecenie {
	TV telewizor;

	public WlaczTelewizor(TV telewizor) {
		super();
		this.telewizor = telewizor;
	}

	public void wykonaj() {
		telewizor.włącz();
	}

	@Override
	public void wycofaj() {
		telewizor.wyłącz();
	}
}
