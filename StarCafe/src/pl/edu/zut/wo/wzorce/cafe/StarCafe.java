package pl.edu.zut.wo.wzorce.cafe;

import pl.edu.zut.wo.wzorce.cafe.napoje.MocnoPalona;
import pl.edu.zut.wo.wzorce.cafe.napoje.Napoj;
import pl.edu.zut.wo.wzorce.cafe.składniki.Czekolada;
import pl.edu.zut.wo.wzorce.cafe.składniki.Mleko;
import pl.edu.zut.wo.wzorce.cafe.składniki.SkladnikDecorator;

public class StarCafe {
	public static void main(String... params) {
		Napoj napoj = new MocnoPalona();
		SkladnikDecorator zMlekiem = new Mleko(napoj);
		SkladnikDecorator zMlekiemICzekolada = new Czekolada(zMlekiem);
		System.out.println(zMlekiemICzekolada.pobierzOpis() + " " + zMlekiemICzekolada.koszt() + "zł");
	}
}
