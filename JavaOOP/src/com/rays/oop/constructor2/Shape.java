package com.rays.oop.constructor2;

public class Shape {

	protected String color;
	protected int borderWidth;
	
	public Shape() {
		
		System.out.println("this is a default constructor of shape");
	}
	
	public Shape(String color) {
		this();
		this.color = color;
		System.out.println(this.color);
	}
	
	public Shape(int borderWidth, String color) {
		this(color);
		this.borderWidth = borderWidth;
		System.out.println(this.borderWidth);
	}
}
