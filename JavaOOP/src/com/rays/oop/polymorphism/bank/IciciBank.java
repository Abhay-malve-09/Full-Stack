package com.rays.oop.polymorphism.bank;

public class IciciBank extends Bank{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ICICI BANK";
	}
	
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 9.8;
	}
}
