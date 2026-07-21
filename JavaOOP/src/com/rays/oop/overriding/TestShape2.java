package com.rays.oop.overriding;

public class TestShape2 {

	public static void main(String[] args) {
		
		//parents can keep child's reference
		//c1 is shape object
		Shape c1 = new Circle();
		
		
		//type casting  shape s1 to Circle c
		
		Circle c = (Circle) c1;
		
		c.setColor("green");
		c.setBorderWidth(5);
		c.setRadius(4);
		
		
		System.out.println("Color: " + c.getColor());
		System.out.println("BorderWidth: " + c.getBorderWidth());
		System.out.println("Radius: " + c.getRadius());
		c.area();
		
		System.out.println("--------------Rectangle-----------------");
		
		
		Shape r1 = new Rectangle();
		
		
		Rectangle r = (Rectangle) r1;
		
		r.setLength(3);
		r.setWidth(2);
		r.setColor("blue");
		r.setBorderWidth(3);
		
		System.out.println("Length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
		System.out.println("Color:" + r.getColor());
		System.out.println("BorderWidth: " + r.getBorderWidth());
		r.area();
		
		System.out.println("-----------Traingle---------------");
		
		Shape t1 = new Traingle();
		
		Traingle t = (Traingle) t1;
		
		t.setBase(2);
		t.setHeight(4);
		t.setColor("green");
		t.setBorderWidth(1);
		
		System.out.println("Base: " + t.getBase());
		System.out.println("height: " + t.getHeight());
		System.out.println("Color: " + t.getColor());
		System.out.println("BorderWidth: " + t.getBorderWidth());
		t.area();
		
	}
}
