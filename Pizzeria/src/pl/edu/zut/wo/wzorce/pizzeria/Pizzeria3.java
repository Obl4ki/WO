package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.WłoskaFabrykaPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class Pizzeria3 {
	Pizza zamówPizza(String type) {
	WłoskaFabrykaPizzy fabryka = new WłoskaFabrykaPizzy();
	Pizza nowapizza = fabryka.utwórzPizza(type);
	return nowapizza;
	}
}
