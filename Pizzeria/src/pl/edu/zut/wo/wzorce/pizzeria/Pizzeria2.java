package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.fabryka.AmerykańskaFabrykaPizzy;
import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;


public class Pizzeria2 {
	Pizza zamówPizza(String type) {
	AmerykańskaFabrykaPizzy fabryka = new AmerykańskaFabrykaPizzy();
	Pizza nowapizza = fabryka.utwórzPizza(type);
	return nowapizza;
	}
}
