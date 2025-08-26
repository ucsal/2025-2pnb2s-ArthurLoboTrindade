package br.com.mariojp.solid.srp;

public class TaxCalculator {
	
	public Double taxGenerator(Double subtotal, String taxRateString) {
		double taxRate = Double.parseDouble(taxRateString);
		double tax = subtotal * taxRate;
		return tax;

	}
	
}
