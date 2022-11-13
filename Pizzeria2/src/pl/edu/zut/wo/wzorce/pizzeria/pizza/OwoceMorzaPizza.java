package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkładnikówPizzy;

public class OwoceMorzaPizza extends Pizza {
	FabrykaSkładnikówPizzy fabrykaSkładników;

	public OwoceMorzaPizza(FabrykaSkładnikówPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	public void przygotowanie() {
		this.nazwa = "Pizza owoce morza";
		System.out.println("Przygotowywanie: " + nazwa);
		this.ciasto = fabrykaSkładników.utworzCiasto();
		this.sos = fabrykaSkładników.utwórzSos();
		this.ser = fabrykaSkładników.utwórzSer();
		this.małze = fabrykaSkładników.utwórzMałże();
	}
}