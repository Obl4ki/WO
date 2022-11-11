package pl.edu.zut.wo.wzorce.pizzeria.fabryka;

import pl.edu.zut.wo.wzorce.pizzeria.pizza.AmerykańskaOwoceMorzaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.AmerykańskaPepperoniPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.AmerykańskaSerowaPizza;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.AmerykańskaWegetariańskaPizza;

public class AmerykańskaFabrykaPizzy extends ProstaFabrykaPizzy {
	public Pizza utwórzPizza(String type) {
		Pizza pizza = null;
		if (type.equals("serowa")) {
			pizza = new AmerykańskaSerowaPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new AmerykańskaPepperoniPizza();
		} else if (type.equals("owocemorza")) {
			pizza = new AmerykańskaOwoceMorzaPizza();
		} else if (type.equals("wegetariańska")) {
			pizza = new AmerykańskaWegetariańskaPizza();
		}
		pizza.przygotowanie();
		pizza.pieczenie();
		pizza.krojenie();
		pizza.pakowanie();
		return pizza;
	}
}
