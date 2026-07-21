package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		Person ps = new Person();
		
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		ps.setName("Abhay");
		ps.setAddress("Indore");
		ps.setDob(sdf.parse("2005-8-03"));
		
		System.out.println("Name " + ps.getName());
		System.out.println("Address " + ps.getAddress());
		System.out.println("Dob " + sdf.format(ps.getDob()));
		
		System.out.println("Age " + ps.getAge(ps.getDob()));
		
	}
	
}
