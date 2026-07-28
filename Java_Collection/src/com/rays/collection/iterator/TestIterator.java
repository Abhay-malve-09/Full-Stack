package com.rays.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("watermalen");
		list.add("Chiku");

		System.out.println("List: " + list);

		System.out.println("--------------------");

		Iterator it = list.iterator(); // iterator ka Object laker deta he 
		
		//list.add("Mango"); // Throw ConcurrentModificationExceptionObject ---> Fail-Fast (bnane ke bad elements store nhi krte

		while (it.hasNext()) {
			// it.remove(); // Throw IllegalStateException if removes first before print method
			
			Object o = it.next(); // ?

			System.out.println(o);

			//it.remove(); // removes all elements
			
			if(o.equals("Orange")) { // remove specific element
				it.remove();
			}
		}

		System.out.println("-------------------");
		System.out.println("List: " + list);
	}

}
