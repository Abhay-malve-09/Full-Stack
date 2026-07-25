package com.rays.collection.stack;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		// push() for insert
		// peek() for print last element
		// pop() for remove last element
		Stack s = new Stack();

		Stack s1 = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}

		System.out.println(s);

//		for (char c = 'a'; c <= 'z'; c++) {
//			s1.push(s.pop());
//		}

		while(!s.isEmpty()) { //jab tak stack empty nhi he tab tak while loop chlega or s.pop() se nikalenege or s1.push() me add kr denge
			s1.push(s.pop());
		}
		System.out.println(s1);
		
	}
}
