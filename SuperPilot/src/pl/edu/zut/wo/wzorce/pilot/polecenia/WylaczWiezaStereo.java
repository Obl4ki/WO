package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WieżaStereo;

public class WylaczWiezaStereo implements Polecenie {
	WieżaStereo wiezaStereo;

	public WylaczWiezaStereo(WieżaStereo wieza) {
		super();
		this.wiezaStereo = wieza;
	}

	public void wykonaj() {
		wiezaStereo.wyłącz();
	}

	@Override
	public void wycofaj() {
		wiezaStereo.włącz();;
	}
}
