package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		Employee pos;
		
		
		
		List<Employee> employee = new ArrayList<Employee>();
		System.out.print("How many employees will be registred? ");
		int qnt = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<qnt; i++) {
			System.out.println();
			System.out.printf("Employee #%d:%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			employee.add(new Employee(id, name, salary));
		}
		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		
		int id = sc.nextInt();
		sc.nextLine();
		
		pos = employee.stream().filter(x -> x.getId()== id).findFirst().orElse(null);  // aqui passa por referencia!
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			pos.increaseSalary(percentage);
		}
		
		
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee x : employee) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
