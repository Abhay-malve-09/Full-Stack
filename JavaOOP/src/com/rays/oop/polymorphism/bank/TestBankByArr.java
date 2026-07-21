package com.rays.oop.polymorphism.bank;

public class TestBankByArr {

	public static void main(String[] args) {
		
		Bank[] b = new Bank[3];
		
		b[0] = new AxisBank();
		b[1] = new IciciBank();
		b[2] = new SbiBank();
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i].getName() + " " + b[i].getInterestRate() );
		}
	}
}
