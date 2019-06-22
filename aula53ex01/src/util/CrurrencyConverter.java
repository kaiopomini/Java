package util;

public class CrurrencyConverter {
	
	public static final double TAX = 0.06;
	
	public static double dollarToReal(double price, double amount) {
		double total = price * amount;
		total += total*TAX;
		return total ;
	}
	

}
