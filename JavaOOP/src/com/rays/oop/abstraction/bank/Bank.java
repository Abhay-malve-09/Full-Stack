package com.rays.oop.abstraction.bank;

public abstract class Bank {

	protected String name;
	protected double interestRate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public abstract double getInterestRate();
}
