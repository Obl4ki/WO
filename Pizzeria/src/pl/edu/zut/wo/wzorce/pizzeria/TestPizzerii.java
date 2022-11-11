package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class TestPizzerii {

	public static void main(String[] args) {
		Pizzeria4 pizzeria = new Pizzeria4();
		Pizza pizza = pizzeria.zamówPizza("serowa");
		System.out.println(pizzeria.getClass().getSimpleName() + " wyprodukowała " + pizza.getClass().getSimpleName());
		
		Pizzeria3 Włoskapizzeria = new Pizzeria3();
		Pizza Wpizza = Włoskapizzeria.zamówPizza("pepperoni");
		System.out.println(Włoskapizzeria.getClass().getSimpleName() + " wyprodukowała " + Wpizza.getClass().getSimpleName());
		
		Pizzeria2 Amerykańskapizzeria = new Pizzeria2();
		Pizza Apizza = Amerykańskapizzeria.zamówPizza("owocemorza");
		System.out.println(Amerykańskapizzeria.getClass().getSimpleName() + " wyprodukowała " + Apizza.getClass().getSimpleName());
	}
}
