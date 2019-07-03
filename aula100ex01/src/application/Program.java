package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
				
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data");
		System.out.print("Status: ");
		String status = sc.next();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

		System.out.print("How many times to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Enter #" + (i+1) +" item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			OrderItem item = new OrderItem(quantity, price, new Product(productName, price));
			order.addItem(item);
		}
		
				
		System.out.println(order);
		
		sc.close();
			

	}

}
