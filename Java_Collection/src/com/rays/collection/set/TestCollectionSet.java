package com.rays.collection.set;

import java.util.*;

public class TestCollectionSet {
	public static void main(String[] args) {

		Set s = new HashSet();
        
		
		s.add("name");
		System.out.println(s.size());
		System.out.println(s);

		System.out.println(s.add(null));

	}
}
