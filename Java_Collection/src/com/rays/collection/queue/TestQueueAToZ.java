package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueAToZ {
public static void main(String[] args) {
	
	Queue q = new ArrayDeque();
	
	Queue q1 = new ArrayDeque();
	
	for(char c='a'; c<='z'; c++) {
		q.add(c);
	}
	
	System.out.println(q);
	
	while(!q.isEmpty()) { //jab tak queue empty nhi he tab tak while loop chlega or q.remove() se nikalenege or q1.add() me add kr denge
		q1.add(q.remove());
	}
	
	System.out.println(q);
	System.out.println(q1);
}
}
