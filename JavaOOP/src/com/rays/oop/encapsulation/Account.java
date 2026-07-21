package com.rays.oop.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(double balance) {
		this.balance  = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance  = balance + amt;
		System.out.println("total balance after deposit: " + balance);
	}
	
	public void withdrawal(double amt) {
		if(amt > balance) {
			System.out.println("insufficent fund transfer");
		} else {
			balance = balance - amt;
			System.out.println("total amount after withdrawal: " + balance);
		}
	}
	
	public double getBalance(double balance) {
		
		return balance;
		
	}
	
	public void fundTransfer(double amt) {
		
		if(amt > balance) {
			System.out.println("insufficient balance for fund transfer");
		} else {
			balance = balance - amt;
			System.out.println("Total balance available after fund transer: " + balance);
		}
	}
	
	public void payBill(double amt) {
		if(amt > balance) {
			System.out.println("insufficient fund for pay bill");
		} else {
			
			balance = balance -amt;
			System.out.println("Total balance available after pay bill: " + balance);
		}
	}

}
