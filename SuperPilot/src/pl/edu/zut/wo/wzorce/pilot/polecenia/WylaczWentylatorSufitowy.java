package pl.edu.zut.wo.wzorce.pilot.polecenia;

import pl.edu.zut.wo.wzorce.pilot.sterowniki.WentylatorSufitowy;

public class WylaczWentylatorSufitowy implements Polecenie {
    WentylatorSufitowy wentylator;

    public WylaczWentylatorSufitowy(WentylatorSufitowy wentylator) {
        super();
        this.wentylator = wentylator;
    }

    public void wykonaj() {
        wentylator.off();
    }

    @Override
    public void wycofaj() {
        wentylator.wolno();
    }
}
