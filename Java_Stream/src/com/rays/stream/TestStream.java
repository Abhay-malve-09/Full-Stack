package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Varun");
		list.add("Tarun");
		list.add("Akshay");
		list.add("Akshay");

		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("---------------");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("---------------");
		
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("-----map method------");
		
		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		
		System.out.println("---------------");
		
		list.stream().map(e -> e.toUpperCase()).distinct().forEach(System.out::println);
		
		System.out.println("------filter method-----------");
		
		list.stream().filter(e -> e.startsWith("A")).distinct().forEach(System.out::println); //e = e.string ka object hota he  pehele se easliye wo e likhte he to wo e.String hi hota he short form me
		 
	}
}
