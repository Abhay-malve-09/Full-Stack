package com.rays.collection.list;

import java.util.*;

public class RemoveDuplicateList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		ArrayList list1 = new ArrayList();
		
		//Collection c = new ArrayList();
		
		list.add("fruits");
		list.add("fruits");
		list.add("apple");
		list.add("grapse");
		list.add("apple");
		list.add("mellon");
		
	 
		
		for(Object o : list) {
			
			if(!list1.contains(o)) {

				list1.add(o);
               
		}
			
		}
		System.out.println("Original list: " + list);
		
		 
		System.out.println("New list: " + list1);
		
	}
}

	

