package com.rays.collection.queue;

import java.util.*;

public class TestCollectionQueue {
	public static void main(String[] args) {
   
		Queue<Object> q = new ArrayDeque<>();
		
		q.offer("hello");
		q.offer(12);
		q.offer('d');
		
		
		System.out.println(q.element());
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.offer("abhay"));
		System.out.println(q);
		
		
	}
}
