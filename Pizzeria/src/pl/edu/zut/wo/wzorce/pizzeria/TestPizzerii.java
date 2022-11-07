package pl.edu.zut.wo.wzorce.pizzeria;

import pl.edu.zut.wo.wzorce.pizzeria.pizza.Pizza;

public class TestPizzerii {

	public static void main(String[] args) {
		Pizzeria3 pizzeria = new Pizzeria3();
		Pizza pizza = pizzeria.zamówPizza("serowa");
		System.out.println(pizzeria.getClass().getSimpleName() + " wyprodukowała " + pizza.getClass().getSimpleName());
	}
}
