package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napoj;

public class BitaSmietana extends SkladnikDecorator {
    private Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return "Bita śmietana + " + this.napoj.pobierzOpis();
    }

    public double koszt() {
        return 0.1 + this.napoj.koszt();
    }
}
