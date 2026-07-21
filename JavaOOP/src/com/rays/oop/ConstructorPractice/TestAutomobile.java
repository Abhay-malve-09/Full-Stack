package com.rays.oop.ConstructorPractice;

public class TestAutomobile {
 public static void main(String[] args) {
	
	 Automobile a = new Automobile("Red", 400, "maruti", "dzire");
	 
	 System.out.println(a.getColor());
	 System.out.println(a.getSpeed());
	 System.out.println(a.getMake());
	 System.out.println(a.getModel());
}
}
