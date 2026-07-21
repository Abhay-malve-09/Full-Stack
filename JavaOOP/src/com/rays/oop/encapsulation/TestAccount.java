package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.setNumber("123456");
		ac.setAccountType("Saving");
		ac.setBalance(1000.00);
		
		System.out.println("Number " + ac.getNumber());
		System.out.println("AccountType " + ac.getAccountType());
		System.out.println("Balance " + ac.getBalance());
		ac.deposit(500.00);
		ac.withdrawal(500.00);
		
		System.out.println("balanace available: " + ac.getBalance());
		ac.fundTransfer(500.00);
		ac.payBill(300.00);
	}
}
