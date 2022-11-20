package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WieżaStereo;

public class WiezaStereoWlaczCD implements Polecenie {
	WieżaStereo wiezaStereo;

	public WiezaStereoWlaczCD(WieżaStereo wieza) {
		super();
		this.wiezaStereo = wieza;
	}

	public void wykonaj() {
		wiezaStereo.ustawCD();
	}

	@Override
	public void wycofaj() {
		wiezaStereo.ustawDVD();
	}
}
