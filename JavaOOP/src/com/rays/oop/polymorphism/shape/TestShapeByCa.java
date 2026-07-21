package com.rays.oop.polymorphism.shape;

public class TestShapeByCa {
public static void main(String[] args) {
		
		Shape s1 = new Circle();
		
		//type casting
		
		Circle c = (Circle) s1;
		
		c.setRadius(4);
		
		System.out.println("Radius: " + c.getRadius());
		c.area();
		
		
		System.out.println("---------------------");
		
		Shape s2 = new Rectangle();
		
		//type casting
		
		Rectangle r = (Rectangle) s2;
		
		r.setLength(2);
		r.setWidth(3);
		
		System.out.println("length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
		r.area();
		
		System.out.println("------------------------");
		
		Shape s3 = new Traingle();
		
		//type Casting
		
		Traingle t = (Traingle) s3;
		
		t.setBase(2);
		t.setHeight(3);
		
		System.out.println("Base: " + t.getBase());
		System.out.println("Height: " + t.getHeight() );
		t.area();
		
	}
}
