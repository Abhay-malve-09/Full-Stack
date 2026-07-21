package com.rays.oop.polymorphism.shape;

public class TestShapebyArr {

	public static void main(String[] args) {
		
    Shape[] s = new Shape[3];
    
    s[0] = new Circle();
    s[1] = new Rectangle();
    s[2] = new Traingle();
    
    Circle c = (Circle) s[0];
    
    c.setRadius(4);
    
    System.out.println("Radius: " + c.getRadius());
    c.area();
    
    System.out.println("-------------------------");
    
    Rectangle r = (Rectangle) s[1];
    
    r.setLength(4);
    r.setWidth(5);
    
    System.out.println("Length: " + r.getLength());
    System.out.println("Width: " + r.getWidth());
    r.area();
    
    System.out.println("-----------------------");
    
    Traingle t = (Traingle) s[2];
    
    t.setBase(5);
    t.setHeight(6);
    
    System.out.println("Base: " + t.getBase());
    System.out.println("Height: " + t.getHeight());
    t.area();
	}
}
