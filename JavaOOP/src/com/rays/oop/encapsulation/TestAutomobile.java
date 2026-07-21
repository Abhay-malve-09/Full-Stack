package com.rays.oop.encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {
		
		Automobile am = new Automobile();
		
		am.setColor("Red");
		am.setSpeed(20);
		am.setMake("Car");
		
		System.out.println(am.getColor());
		System.out.println(am.getSpeed());
		System.out.println(am.getMake());
		am.brake();
		System.out.println(am.getSpeed());
		am.accelerator();
		System.out.println(am.getSpeed());
		am.changeGear(6);
	    System.out.println("speed is: " +	am.getSpeed());
	}
}
