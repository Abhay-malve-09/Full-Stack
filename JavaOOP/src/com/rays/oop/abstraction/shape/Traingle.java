package com.rays.oop.abstraction.shape;

public class Traingle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of traingle: " + base * height);
		
	}
}
