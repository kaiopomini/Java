package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account () {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdawLimit) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdawLimit() {
		return withdrawLimit;
	}

	public void setWithdawLimit(Double withdawLimit) {
		this.withdrawLimit = withdawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	public void withdraw(Double amount) throws DomainException {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}
	
}
