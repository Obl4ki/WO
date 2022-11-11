package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.pizza.WłoskaOwoceMorzaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WłoskaPepperoniPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WłoskaSerowaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.WłoskaWegetariańskaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class WłoskaFabrykaPizzy extends ProstaFabrykaPizzy {
	public Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		if (type.equals("serowa")) {
			pizza = new WłoskaSerowaPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new WłoskaPepperoniPizza();
		} else if (type.equals("owocemorza")) {
			pizza = new WłoskaOwoceMorzaPizza();
		} else if (type.equals("wegetariańska")) {
			pizza = new WłoskaWegetariańskaPizza();
		}
		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();
		return pizza;
	}
}
