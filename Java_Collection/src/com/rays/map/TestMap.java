package com.rays.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put("name", 1);
		m.put("Mango", 2);
		m.put("apple", 3);
		m.put("Khush", 4);
		
		System.out.println(m);
		
		System.out.println(m.get("apple"));
		
		System.out.println(m.containsKey("apple"));
		
	    System.out.println(m.containsValue(3));
	   
		System.out.println(m.entrySet());
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());

		System.out.println(m.remove("apple") +" " + m);
		
		

		System.out.println(m.size());

		System.out.println(m.values());

		m.clear();
		 System.out.println(m);

		
		
		
	}
}
