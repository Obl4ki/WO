package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napoj;

public class MleczkoSojowe extends SkladnikDecorator {
    private Napoj napoj;

    MleczkoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return "Mleczko sojowe + " + this.napoj.pobierzOpis();
    }

    public double koszt() {
        return 0.15 + this.napoj.koszt();
    }
}
