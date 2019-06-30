package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		int pos = 0;
		String name, email;
		sc.nextLine();
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.printf("Rent #%d%n", i+1);
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			pos = sc.nextInt();
			sc.nextLine();
			System.out.println();
			vect[pos] = new Room(name, email);
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i<10; i++) {
			if (vect[i] != null) {
				System.out.print(i + ": ");
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
