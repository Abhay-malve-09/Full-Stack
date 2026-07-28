package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
	
public static void main(String[] args) {
	
	List list = new ArrayList();
	
	list.add('b');
	list.add('c');
	list.add('e');
	list.add('a');
	list.add('d');
	list.add('f');
	
	System.out.println("Natural list: " + list);
	
	System.out.println("-----------------");
	
	Collections.sort(list);
	
	System.out.println("Sorted list: " + list);
	
}
}
