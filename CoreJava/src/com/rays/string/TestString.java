package com.rays.string;

public class TestString {

public static void main(String[] args) {
		
		String name = "Vijay Dinanath Chouhan";
		
		System.out.println("name = " + name );             //Vijay Dinanath Chouhan
		System.out.println("length : " + name.length());                   //22
		System.out.println("7th char is : " + name.charAt(6));             // D
		System.out.println("First index of K " + name.indexOf ('k'));      // -1
		System.out.println("Last index of a " + name.lastIndexOf('a'));    //20
		System.out.println(name.replace('a', 'b'));                        //Vijby Dinbnbth Chouhbn
		System.out.println("chota vijay: " + name.toLowerCase());         // vijay dinanath chouhan
		System.out.println("bada vijay: " + name.toUpperCase());         //VIJAY DINANATH CHOUHAN
		System.out.println(name.startsWith("Vijay"));                   //true
		System.out.println(name.endsWith("Han"));                   //false
		System.out.println(name.substring(6 , 9));
	}
}
