package com.rays.collection.list;

import java.util.*;

public class TestCollectionList {
	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("a");
		l.add("name");
		l.add(true);
		l.add(7.6);
		l.add(null);
		l.add(null);

		System.out.println("--------------------insert object at postion i-------------------");

	     l.add(0, 'b');
	     System.out.println(l);
	     
	     System.out.println("--------------------return the ith element-------------------");
	     
	     //l.get(0);
	     System.out.println(l.get(0));
	     
	     System.out.println("--------------------remove the ith element-------------------");
	     
	     System.out.println(l.remove(1) +" "+ l);
	     
	     System.out.println("List is: " + l);
	     
	     System.out.println(l.remove(1) +" "+ l);

	     System.out.println("-------------------replace ith element with o-------------------");
	     
	     System.out.println(l.set(1, "kratik") +" " + l);
	     
	     System.out.println("List is: " + l);
	     
	     System.out.println("------------------- searches objects from begining-------------------");
	     
	     System.out.println(l.indexOf("kratik") +" " + l);
	     
	     System.out.println("------------------- searches objects from end -------------------");
	     
	     System.out.println(l.lastIndexOf(7.6) +" " + l);
	     
	     System.out.println("------------------- return subList -------------------");
	     
	     System.out.println(l.subList(0, 2) +" " + l);
	     
	     System.out.println("------------------- return null -------------------");
	     
	     System.out.println(l);
	}
}
