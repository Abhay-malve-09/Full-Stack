package com.rays.collection.list.customList.employee;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeByForEachMethod {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ram", "TCS", 50000);
		Employee e2 = new Employee("Shaym", "Infosis", 65000);
		Employee e3 = new Employee("Aman", "Accenture", 70000);
		Employee e4 = new Employee("Abhijeet", "Ibm", 100000);
		Employee e5 = new Employee("Vishal", "Amazon", 120000);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e5);
		list.add(e2);
		list.add(e1);
		list.add(e4);
		list.add(e3);
	
		list.forEach(System.out::println);
	}
}
