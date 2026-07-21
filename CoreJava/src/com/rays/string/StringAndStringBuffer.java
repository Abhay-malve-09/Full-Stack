package com.rays.string;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		
		String name = "sunrays";
		
		System.out.println(name);
		
		System.out.println(name.replace('s', 't'));
		
		System.out.println(name);
		
		
		System.out.println("---------------------------------------");
		
		
		StringBuffer sb = new StringBuffer("sunrays");
		
		System.out.println(sb);
		
		System.out.println(sb.append(" house "));
		
		System.out.println(sb);
	}
}
