package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napoj;

public class Czekolada extends SkladnikDecorator {
    private Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return "Czekolada + " + this.napoj.pobierzOpis();
    }

    public double koszt() {
        return 0.2 + this.napoj.koszt();
    }
}
