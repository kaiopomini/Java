package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double firstDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(firstDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}


	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	
	
	public void deposit (double amount) {
		
		this.balance += amount;
		
	}
	
	public void withdraw (double amount) {
				
		this.balance -= amount + 5.00;
		
	}
	
	
	public String toString() {
		
		return "Account " 
				+ number 
				+ ", Holder " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}

	
}
