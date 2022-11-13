package pl.edu.zut.wo.wzorce.pizzeria.pizza;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.FabrykaSkładnikówPizzy;

public class WegetariańskaPizza extends Pizza {
	FabrykaSkładnikówPizzy fabrykaSkładników;

	public WegetariańskaPizza(FabrykaSkładnikówPizzy fabrykaSkładników) {
		this.fabrykaSkładników = fabrykaSkładników;
	}

	@Override
	public void przygotowanie() {
		this.nazwa = "Wege";
		System.out.println("Przygotowywanie: " + nazwa);
		this.ciasto = fabrykaSkładników.utworzCiasto();
		this.sos = fabrykaSkładników.utwórzSos();
		this.ser = fabrykaSkładników.utwórzSer();
		this.warzywa = fabrykaSkładników.utworzWarzywa();
		this.pepperoni = fabrykaSkładników.utworzPepperoni();
	}

}
