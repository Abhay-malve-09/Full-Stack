package com.rays.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetByConstructor {

	public static void main(String[] args) {
		
		MarksheetByConstructor m1 = new MarksheetByConstructor(102, "Anuj", 65);
		MarksheetByConstructor m2 = new MarksheetByConstructor(101, "Arjun", 70);
		MarksheetByConstructor m3 = new MarksheetByConstructor(103, "Kratik", 85);
		
		List<MarksheetByConstructor> list = new ArrayList<MarksheetByConstructor>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("-------------------------");
		
		list.forEach(System.out::println);
		
	}
}
