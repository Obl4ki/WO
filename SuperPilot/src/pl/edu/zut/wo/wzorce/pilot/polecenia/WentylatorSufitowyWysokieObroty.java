package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;

public class WentylatorSufitowyWysokieObroty implements Polecenie {
	WentylatorSufitowy wentylator;

	public WentylatorSufitowyWysokieObroty(WentylatorSufitowy wentylator) {
		super();
		this.wentylator = wentylator;
		;
	}

	public void wykonaj() {
		wentylator.szybko();
	}

	@Override
	public void wycofaj() {
		wentylator.wolno();
	}
}
