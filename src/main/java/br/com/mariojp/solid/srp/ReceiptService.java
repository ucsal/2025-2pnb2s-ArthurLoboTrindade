package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
        String taxRateStr = System.getProperty("tax.rate", "0.10");
		double tax = new TaxCalculator().taxGenerator(subtotal, taxRateStr);
		double total = subtotal + tax;
		return ReceiptFormatter.receiptGenerator(order, subtotal, tax, total);
	}
}
