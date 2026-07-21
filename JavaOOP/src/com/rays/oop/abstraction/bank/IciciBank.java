package com.rays.oop.abstraction.bank;

public class IciciBank extends Bank{

	public String getName() {
		return "ICICI BANK";
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 11.1;
	}
	
	
}
