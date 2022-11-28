package pl.edu.zut.wi.wo.invoice;

import java.time.LocalDate;

public class InvoiceManager {

	public static void printOwing(Invoice invoice) {
		printOnStart();
		// Wyliczenie nale�no�ci.
		double outstanding = countInvoice(invoice);
		// Zapisanie daty p�atno�ci.
		saveDate(invoice);
		// Wy�wietlenie szczeg��w.
		printDetails(invoice, outstanding);
	}

	private static void printDetails(Invoice invoice, double outstanding) {
		System.out.println(String.format("nazwa: %s", invoice.getCustomer()));
		System.out.println(String.format("kwota: %.2f", outstanding));
		System.out.println(String.format("p�atno�� do: %s", invoice.getDueDate()));
	}

	private static void saveDate(Invoice invoice) {
		LocalDate today = LocalDate.now();
		invoice.setDueDate(today.plusDays(30));
	}

	private static double countInvoice(Invoice invoice) {
		double outstanding = 0.;
		for (Order o : invoice.getOrders()) {
			outstanding += o.getAmount();
		}
		return outstanding;
	}

	private static void printOnStart() {
		System.out.println("************************");
		System.out.println("* Rachunek dla klienta *");
		System.out.println("************************");
	}
}
