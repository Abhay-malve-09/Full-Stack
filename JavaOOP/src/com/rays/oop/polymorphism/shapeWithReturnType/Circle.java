package com.rays.oop.polymorphism.shapeWithReturnType;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	 @Override
	public void area() {
		// TODO Auto-generated method stub
	    System.out.println("Area of circle: " + Math.PI*radius*radius);
	}
	
}
