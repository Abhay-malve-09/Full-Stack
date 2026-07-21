package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	public final static int AVG_AGE = 18;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge(Date dob) {
		
		Date now = new Date();
		
		int age = now.getYear() - dob.getYear();
		
		return age;
	}
	
}
