package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Jacuzzi;

public class WylaczJacuzzi implements Polecenie {
	Jacuzzi jacuzzi;

	public WylaczJacuzzi(Jacuzzi jacuzzi) {
		super();
		this.jacuzzi = jacuzzi;
	}

	public void wykonaj() {
        jacuzzi.wyłącz();
        jacuzzi.wyłączDysze();
    }

	@Override
	public void wycofaj() {
		jacuzzi.włącz();
        jacuzzi.włączDysze();

    }
}
