package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napoj;

public class Mleko extends SkladnikDecorator {
    private Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return "Mleko + " + this.napoj.pobierzOpis();
    }

    public double koszt() {
        return 0.1 + this.napoj.koszt();
    }

}
