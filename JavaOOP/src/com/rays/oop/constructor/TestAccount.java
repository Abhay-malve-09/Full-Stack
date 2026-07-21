package com.rays.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {
		
		Account ac =  new Account();
		
		Account ac1 = new Account("5000", "saving", 2025.00);
		
		System.out.println(ac1.getNumber());
		System.out.println(ac1.getAccountType());
		System.out.println(ac1.getBalance());
			
	}
}
