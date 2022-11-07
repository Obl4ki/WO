package pl.edu.zut.wo.wzorce.cafe.składniki;

import pl.edu.zut.wo.wzorce.cafe.napoje.Napoj;

public abstract class SkladnikDecorator extends Napoj {
    public abstract String pobierzOpis();
    public abstract double koszt();
}
