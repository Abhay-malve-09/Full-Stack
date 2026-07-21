package com.rays.oop.overriding;

public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("---------------Circle----------------");
		Circle c = new Circle();
		
//		c.color= "red";
		c.setColor("blue");
		c.setBorderWidth(3);
		c.setRadius(2);
		
		System.out.println("color: " + c.getColor());
		System.out.println("BorderWidth: " + c.getBorderWidth());
		System.out.println("Radius: " + c.getRadius());
		c.area();
		

		System.out.println("---------------Rectangle----------------");
		
		Rectangle r =  new Rectangle();
		
		r.setLength(3);
		r.setWidth(2);
		r.setColor("Red");
		r.setBorderWidth(5);
		
		System.out.println("Length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
		System.out.println("Color: " + r.getColor());
		System.out.println("BorderWidth: " + r.getBorderWidth());
		r.area();
		
		
		System.out.println("---------------Traingle----------------");
		 
		Traingle t = new Traingle();
		
		t.setBase(2);
		t.setHeight(3);
		t.setColor("Orange");
		t.setBorderWidth(4);
		
		System.out.println("Base: " + t.getBase());
		System.out.println("Height: " + t.getHeight());
		System.out.println("Color: " + t.getColor());
		System.out.println("BorderWidth: " + t.getBorderWidth());
		t.area();
		}
	
	 
}
