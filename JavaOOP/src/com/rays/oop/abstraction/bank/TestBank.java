package com.rays.oop.abstraction.bank;

public class TestBank {

	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		
		System.out.println("Name: " + a.getName());
		System.out.println("InterestRate: " + a.getInterestRate());
		
		System.out.println("------------------------");
		
		IciciBank i = new IciciBank();
		
		System.out.println("Name: " + i.getName());
		System.out.println("InterestRate: " + i.getInterestRate());
		
		System.out.println("-------------------------------");
		
		SbiBank s = new SbiBank();
		
		System.out.println("Name: " + s.getName());
		System.out.println("InterestRate: " + s.getInterestRate());
	}
}
