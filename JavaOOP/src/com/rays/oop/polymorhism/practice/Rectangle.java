package com.rays.oop.polymorhism.practice;

public class Rectangle extends Shape {

	private int length;
	
	private int width;
	

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}
	
	public boolean validate() {
		if(this.length > 0 && this.width > 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int rectangleArea = this.length * this.width;
		System.out.println("area of rectangle:" + rectangleArea);
	}

}
