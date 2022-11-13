package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.składniki.*;

public class AmerykanskaFabrykaSkladnikowPizzy implements FabrykaSkładnikówPizzy {
    public Ciasto utworzCiasto() {
        return new GrubeChrupkieCiasto();
    }

    public Małże utwórzMałże() {
        return new MrozoneMalze();
    }

    public Pepperoni utworzPepperoni() {
        return new PlastryPepperoni();
    }

    public Ser[] utwórzSer() {
        Ser[] ser = {new SerMozarella(), new SerParmezan()};
        return ser;
    }

    public Sos utwórzSos() {
        return new SosPomidorowy();
    }

    public Warzywa[] utworzWarzywa() {
        Warzywa[] warzywa = { new Baklazany(), new CzarneOliwki(), new Szpinak() };
        return warzywa;
    }

}
