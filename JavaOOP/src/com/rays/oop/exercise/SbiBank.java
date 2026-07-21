package com.rays.oop.exercise;

public class SbiBank extends Bank{

	public String getName() {
		return name;
	}
	
	public void setNameOfSbi(String nameOfSbi) {
		this.name = nameOfSbi;
	}
	
	public double interestRate() {
		return interestRate;
	}
	
	public void setInterestRateOfSbi(double interestRateOfSbi) {
		this.interestRate = interestRateOfSbi;
	}
	
}
