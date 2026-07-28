package com.rays.collection.vector;

import java.util.Vector;

public class TestVector {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	v.add("one");
	v.add("two");
	v.add("three");
	
	Integer i = new Integer(3);
	v.add(i);
	
	//type caste into vector

	Integer value = (Integer) v.get(3);
	
	System.out.println("Index#3 value: =" + value);
}
}
