package pl.edu.zut.wi.wo.order;

public class OrderCalculator {

	public static double price(Order order) {
		// Cena ko�cowa = cena bazowa � upust + koszt wysy�ki.
		final double basePrice = order.getQuantity() * order.getItemPrice();
		final double discount = Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05;
		final double deliveryPrice = Math.min(order.getQuantity() * order.getItemPrice() * 0.1, 100);
		return basePrice - discount + deliveryPrice;
	}
}
