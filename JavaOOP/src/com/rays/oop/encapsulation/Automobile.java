package com.rays.oop.encapsulation;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public final static int NO_OF_GEARS = 6;
	
	public void setColor(String color ) {
		this.color = color;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void brake() {
		
		if(speed == 0) {
			System.out.println("car already stopped");
		} else {
			speed = speed - 10;
		}
	}
	
	public void accelerator() {
		 
		if(speed == 400 || speed > 400) {
			System.out.println("speed limit is high please apply brake");
		} else {
			speed = speed + 10;
		}
	}
	
	public void changeGear(int gear) {
		
		if(gear > NO_OF_GEARS) {
			System.out.println("ivalid gear...");
		}
		
		if(gear == 1) {
			System.out.println("gear switched 1");
			speed = 20;
			System.out.println("current speed is: " + speed);
		}
		
		if(gear == 2) {
			System.out.println("gear switched 2");
			speed = 40;
			System.out.println("current speed is " + speed);
		}
		
		if(gear == 3) {
			System.out.println("gear switched 3");
			speed  = 60;
			System.out.println("current speed is " + speed);
		}
		
		if(gear == 4) {
			System.out.println("gear switched 4");
			speed  = 80;
			System.out.println("current speed is " + speed);
		}
		
		if(gear == 5) {
			System.out.println("gear switched 5");
			speed  = 100;
			System.out.println("current speed is " + speed);
		}
		
		if(gear == 6) {
			System.out.println("gear switched 6");
			speed  = 120;
			System.out.println("current speed is " + speed);
		}
	}
	public int getSpeed(int speed) {
		
		return speed;
	}
}
