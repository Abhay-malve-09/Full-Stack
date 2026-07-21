package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

public static void main(String[] args) throws ParseException {
	
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    System.out.println("--------Businessman-------------");
    
    
	Businessman b = new Businessman();
	
	b.setName("Anuj");
	b.setAddress("Khargone");
	b.setDateOfBirth(sdf.parse("2005-8-02"));
	
	System.out.println("Name: " + b.getName());
	System.out.println("Address: " + b.getAddress());
	System.out.println("Date Of Birth: " + sdf.format(b.getDateOfBirth()));
	
	
    System.out.println("-------------Doctor---------------");
    
    Doctor d = new Doctor();
    
    d.setRegistrationNo("12345");
    d.setName("Ajay");
    d.setAddress("Khargone");
    d.setDateOfBirth(sdf.parse("2006-5-08"));
    
    System.out.println("Registration No: " + d.getRegistrationNo());
    System.out.println("Name: " + d.getName());
    System.out.println("Address: " + d.getAddress());
    System.out.println("Date Of Birth: " + sdf.format(d.getDateOfBirth()));
    
    
    System.out.println("--------------------Student---------------------");
    
    Student s =  new Student();
    
    s.setRollNo("09");
    s.setMarks(50);
    s.setName("Raghav");
    s.setAddress("Khargone");
    s.setDateOfBirth(sdf.parse("2014-8-02"));

    System.out.println("RollNo: " + s.getRollNo());
    System.out.println("Marks: " + s.getMarks());
    System.out.println("Name: " + s.getName());
    System.out.println("Address: " + s.getAddress());
    System.out.println("Date Of Birth: " + sdf.format(s.getDateOfBirth()));
    
}
}
