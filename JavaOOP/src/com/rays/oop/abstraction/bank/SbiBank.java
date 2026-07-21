package com.rays.oop.abstraction.bank;

public class SbiBank extends Bank{

	public String getName() {
		return "SBI BANK";
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 12.0;
	}
}
