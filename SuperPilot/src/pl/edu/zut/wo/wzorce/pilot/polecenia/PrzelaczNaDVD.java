package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.TV;

public class PrzelaczNaDVD implements Polecenie {
	TV telewizor;

	public PrzelaczNaDVD(TV telewizor) {
		super();
		this.telewizor = telewizor;
	}

	public void wykonaj() {
		telewizor.ustawDVD();
	}

	@Override
	public void wycofaj() {
		telewizor.wyłącz();
	}
}
