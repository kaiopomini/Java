package ex03aula50;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("1st Score: ");
		student.score1 = sc.nextDouble();
		System.out.print("2nd Score: ");
		student.score2 = sc.nextDouble();
		System.out.print("3rd Score: ");
		student.score3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(student.aproved());
		
		sc.close();
	}

}
