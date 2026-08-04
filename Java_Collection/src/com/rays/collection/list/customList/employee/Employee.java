package com.rays.collection.list.customList.employee;

public class Employee {

	private String name;
	private String company;
	private int salary;

	public Employee(String name, String company, int salary) {
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + ", Company: " + company + ", salary: " + salary;
	}

}
