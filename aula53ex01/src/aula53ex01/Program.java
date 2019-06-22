package aula53ex01;

import java.util.Locale;
import java.util.Scanner;

import util.CrurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CrurrencyConverter.dollarToReal(dollarPrice, amount));

		sc.close();
	}

}
