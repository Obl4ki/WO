package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.Jacuzzi;

public class PrzygotujKapielWJacuzzi implements Polecenie {
	Jacuzzi jacuzzi;

	public PrzygotujKapielWJacuzzi(Jacuzzi jacuzzi) {
		super();
		this.jacuzzi = jacuzzi;
	}

	public void wykonaj() {
		jacuzzi.włącz();
        jacuzzi.włączDysze();
	}

	@Override
	public void wycofaj() {
		jacuzzi.wyłącz();
        jacuzzi.wyłączDysze();
	}
}
