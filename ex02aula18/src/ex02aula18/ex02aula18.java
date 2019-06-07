package ex02aula18;

import java.util.Locale;
import java.util.Scanner;

public class ex02aula18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full Name: ");
		String fullName = sc.nextLine();
		System.out.println("How many bedrooms ar there in your house? ");
		int badrooms = sc.nextInt();
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		System.out.println("Enter your LAST NAME, AGE and HEIGHT (same line):");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(fullName);
		System.out.println(badrooms);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		sc.close();
		

	}

}
