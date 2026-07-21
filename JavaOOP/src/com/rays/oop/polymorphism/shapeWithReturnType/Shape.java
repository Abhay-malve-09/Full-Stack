package com.rays.oop.polymorphism.shapeWithReturnType;

public class Shape {

	protected String name;
	protected int borderWidth;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
   public void area() {
	   System.out.println("Area of shape");
   }
   
   public static Shape getShape(int i) {
	   
	   if(i==1) 
		   return new Circle();
	   
	   if(i==2) 
		   return new Rectangle();
	   
	   if(i==3)
		   return new Traingle();
	   
	   return new Shape();
   }
}
