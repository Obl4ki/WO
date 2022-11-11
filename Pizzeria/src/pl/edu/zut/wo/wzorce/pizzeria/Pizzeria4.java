package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.ProstaFabrykaPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class Pizzeria4 {
	Pizza zamówPizza(String type) {
	ProstaFabrykaPizzy fabryka = new ProstaFabrykaPizzy();
	Pizza nowapizza = fabryka.utwórzPizza(type);
	return nowapizza;
	}
}
