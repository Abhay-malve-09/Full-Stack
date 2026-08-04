package com.rays.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheetByGetSet {

	public static void main(String[] args) {

		MarksheetByGetSet m1 = new MarksheetByGetSet();

		m1.setRollNo(102);
		m1.setName("Anujash");
		m1.setPhy(65);

		MarksheetByGetSet m2 = new MarksheetByGetSet();

		m2.setRollNo(101);
		m2.setName("Aakash");
		m2.setPhy(67);

		MarksheetByGetSet m3 = new MarksheetByGetSet();

		m3.setRollNo(103);
		m3.setName("Radhesh");
		m3.setPhy(70);

		List<MarksheetByGetSet> list = new ArrayList<>();

		list.add(m1);
		list.add(m2);
		list.add(m3);

		Iterator<MarksheetByGetSet> i = list.iterator();

		while (i.hasNext()) {
			 MarksheetByGetSet m = i.next();
			System.out.println("RollNo: " + m.getRollNo() + " Name: " + m.getName() + " Phy: " + m.getPhy());
		}
		
		Collections.sort(list);
		
		System.out.println("---------------------");
		
		Iterator<MarksheetByGetSet> j = list.iterator();
		
		while (j.hasNext()) {
			 MarksheetByGetSet m = j.next();
			System.out.println("RollNo: " + m.getRollNo() + " Name: " + m.getName() + " Phy: " + m.getPhy());
		}
	}
}
