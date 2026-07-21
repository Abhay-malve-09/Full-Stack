package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {
		 
		System.out.println("---------Circle-----------");
		Circle c = new Circle();
		
		c.setRadius(2);
		c.setColor("red");
		c.setBorderWidth(1);
		
		
		
	    System.out.println("Radius: " + c.getRadius());
	    System.out.println("Color: " + c.getColor());
	    System.out.println("BorderWidth: " + c.getBorderWidth());
	    c.area();
	    
	    
	    System.out.println("----------Rectangle-----------");
	    
	    Rectangle r = new Rectangle();
	    
	    r.setLength(5);
	    r.setWidth(10);
	    r.setColor("blue");
	    r.setBorderWidth(3);
	    
	    
	    System.out.println("Length: " + r.getLength());
	    System.out.println("width: " + r.getWidth());
	    System.out.println("color: " + r.getColor());
	    System.out.println("borderWidth: " + r.getBorderWidth());
	    r.area();
	    
	    
	    System.out.println("-----------triangle--------------");
	    
	    Triangle t = new Triangle();
	    
	    t.setBase(3);
	    t.setHeight(4);
	    t.setColor("black");
	    t.setBorderWidth(1);
	    
	    
	    
	    System.out.println("base: " + t.getBase());
	    System.out.println("height: " + t.getHeight());
	    System.out.println("color: " + t.getColor());
	    System.out.println("borderWidth: " + t.getBorderWidth());
	    t.area();
	}
}
