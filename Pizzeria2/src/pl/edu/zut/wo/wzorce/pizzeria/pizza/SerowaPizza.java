package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkładnikówPizzy;

public class SerowaPizza extends Pizza {
	FabrykaSkładnikówPizzy fabrykaSkładników;

	public SerowaPizza(FabrykaSkładnikówPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		this.nazwa = "Serowa pizza";
		System.out.println("Przygotowywanie: " + nazwa);
		this.sos = fabrykaSkładników.utwórzSos();
		this.ser = fabrykaSkładników.utwórzSer();
	}

}
