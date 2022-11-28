package pl.edu.zut.wi.wo.order;

public class OrderCalculator {

	public static double price(Order order) {
		// Cena koñcowa = cena bazowa – upust + koszt wysy³ki.
		return order.getQuantity() * order.getItemPrice()
				- Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05
				+ Math.min(order.getQuantity() * order.getItemPrice() * 0.1, 100);
	}
}
