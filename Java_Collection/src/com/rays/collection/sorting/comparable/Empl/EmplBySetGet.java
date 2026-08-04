package com.rays.collection.sorting.comparable.Empl;

public class EmplBySetGet implements Comparable<EmplBySetGet> {

	private String name;
	private String company;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmplBySetGet [name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(EmplBySetGet e) {
		
		// return this.name.compareTo(e.name);
//		return this.company.compareTo(e.company);
		return (int) (this.salary - e.salary);
	}
}
