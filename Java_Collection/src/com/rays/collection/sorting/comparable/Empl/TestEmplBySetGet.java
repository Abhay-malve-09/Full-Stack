package com.rays.collection.sorting.comparable.Empl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmplBySetGet {

	public static void main(String[] args) {
		
		EmplBySetGet e1 = new EmplBySetGet();
		
		e1.setName("Ram");
		e1.setCompany("TCS");
		e1.setSalary(55000.00);
		
		EmplBySetGet e2 = new EmplBySetGet();
		
		e2.setName("Suraj");
		e2.setCompany("Infosis");
		e2.setSalary(100000.00);

		EmplBySetGet e3 = new EmplBySetGet();
		
		e3.setName("Kumar");
		e3.setCompany("Amazon");
		e3.setSalary(70000.00);

		List<EmplBySetGet> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		

		
		list.forEach(System.out::println);
			
			Collections.sort(list);
			
			System.out.println("-----------------------");
			
			list.forEach(System.out::println);
			
			}
	}

