package com.rays.collection.list.customList.marksheet;

import java.util.ArrayList;
import java.util.List;

public class TestMarksheetByForEachMethod {

	public static void main(String[] args) {

		Marksheet m1 = new Marksheet("Anuj", 101, 50, 60, 65);
		Marksheet m2 = new Marksheet("Ram", 102, 50, 65, 70);
		Marksheet m3 = new Marksheet("Raghav", 103, 65, 60, 75);
		Marksheet m4 = new Marksheet("Surajj", 104, 60, 65, 70);
		
		List<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(m4);
		list.add(m2);
		list.add(m1);
		list.add(m3);
		
		list.forEach(System.out::println);
	}
}
