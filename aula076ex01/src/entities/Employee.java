package entities;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(Integer id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		this.salary += this.salary * (percentage / 100);
	}

	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f", salary);
	}
	
	
}
