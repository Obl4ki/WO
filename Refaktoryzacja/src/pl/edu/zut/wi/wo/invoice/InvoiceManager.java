package pl.edu.zut.wi.wo.invoice;

import java.time.LocalDate;

public class InvoiceManager {

	public static void printOwing(Invoice invoice) {
		double outstanding = 0;
		System.out.println("************************");
		System.out.println("* Rachunek dla klienta *");
		System.out.println("************************");
		// Wyliczenie należności.
		for (Order o : invoice.getOrders()) {
			outstanding += o.getAmount();
		}
		// Zapisanie daty płatności.
		LocalDate today = LocalDate.now();  
		invoice.setDueDate(today.plusDays(30));
		// Wyświetlenie szczegółów.
		System.out.println(String.format("nazwa: %s", invoice.getCustomer()));
		System.out.println(String.format("kwota: %.2f", outstanding));
		System.out.println(String.format("płatność do: %s", invoice.getDueDate()));		
	}

}
