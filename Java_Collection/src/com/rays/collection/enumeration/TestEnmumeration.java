package com.rays.collection.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnmumeration {
public static void main(String[] args) {
	
	Vector v = new Vector();
	
	v.add("Mango");
	v.add("Orange");
	v.add("Apple");
	v.add("Banana");
	v.add("Watermalen");
	v.add("Chiku");
	

	
	System.out.println("V: " + v);
	
	System.out.println("--------------------");
	
	Enumeration e = v.elements();
	
	v.add("Apple"); // No exception here --> Fail- Safe
	
	while(e.hasMoreElements()) {
		
		Object o = e.nextElement();
		
		System.out.println(o);
	}
	
	System.out.println("----------------");
	
	System.out.println("V: " + v);
}
}
