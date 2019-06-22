package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double amount;
		Account accountHolder;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n) ");
		String test = sc.nextLine();
		
		
		if (test.contains("y") || test.contains("Y")){
			
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			accountHolder = new Account(accountNumber, holderName, amount);
			sc.nextLine();
			
		} else {
			
			accountHolder = new Account(accountNumber, holderName);
		
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println( accountHolder);	
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		accountHolder.deposit(amount);
		
		System.out.println("Updated account Data:");
		System.out.println( accountHolder);	
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		accountHolder.withdraw(amount);
		
		System.out.println("Updated account Data:");
		System.out.println( accountHolder);	
		
		sc.close();
	}

}
