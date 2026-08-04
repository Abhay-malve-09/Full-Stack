package com.rays.collection.list.customList.student;

public class Student {

	private String name;
	private int rollNo;
	private String subject;

	public Student(String name, int rollNo, String subject) {
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + name + ", rollNo: " + rollNo + ", subject: " + subject;
	}

}
