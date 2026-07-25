package com.rays.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueCheckException {
public static void main(String[] args) {
	
	PriorityQueue p = new PriorityQueue();
	
	p.add("name");
	p.add("Hello");
	p.add("world");
	p.add("hy");
	p.add(1);
	
	System.out.println(p);
}
}
