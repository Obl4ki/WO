package pl.edu.zut.wi.wo.invoice;

import java.time.LocalDate;

public class InvoiceManager {

	public static void printOwing(Invoice invoice) {
		double outstanding = 0;
		System.out.println("************************");
		System.out.println("* Rachunek dla klienta *");
		System.out.println("************************");
		// Wyliczenie nale¿noœci.
		for (Order o : invoice.getOrders()) {
			outstanding += o.getAmount();
		}
		// Zapisanie daty p³atnoœci.
		LocalDate today = LocalDate.now();  
		invoice.setDueDate(today.plusDays(30));
		// Wyœwietlenie szczegó³ów.
		System.out.println(String.format("nazwa: %s", invoice.getCustomer()));
		System.out.println(String.format("kwota: %.2f", outstanding));
		System.out.println(String.format("p³atnoœæ do: %s", invoice.getDueDate()));		
	}

}
