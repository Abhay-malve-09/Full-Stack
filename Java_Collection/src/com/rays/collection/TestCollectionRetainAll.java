package com.rays.collection;

import java.util.*;

public class TestCollectionRetainAll {
	public static void main(String[] args) {
 
		//if  originalCollection(c.add) is modified? if yes true else false.
		
		Collection c = new ArrayList();
		
		c.add(40);
		c.add("My name is hello");
		c.add('a');
		
		
		
		Collection c1 = new ArrayList();
		
		c1.add(46);
		c1.add("My name is");
		c1.add('a');
		
		System.out.println(c.retainAll(c1)); //c1 essa hi same hi print hojyga or c me jo match hoga wo print hoga
		System.out.println(c);
		System.out.println(c1);
		
		
	}
}
