package com.rays.oop.polymorphism.BankWithReturnType;

public class AxisBank extends Bank{

	public String getName() {
		return "AXIS BANK";
	}
	
	@Override
	public double interestRate() {
		// TODO Auto-generated method stub
		return  11.0;
	}
}
