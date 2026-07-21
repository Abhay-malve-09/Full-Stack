package com.rays.oop.polymorphism.shape;

public class TestShape {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		
		c.setRadius(4);
		
		System.out.println("Radius: " + c.getRadius());
		c.area();
		
		
		System.out.println("---------------------");
		
		Rectangle r = new Rectangle();
		
		r.setLength(2);
		r.setWidth(3);
		
		System.out.println("length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
		r.area();
		
		System.out.println("----------------------");
		
		Traingle t = new Traingle();
		
		t.setBase(2);
		t.setHeight(3);
		
		System.out.println("Base: " + t.getBase());
		System.out.println("Height: " + t.getHeight());
		t.area();
	}
}
