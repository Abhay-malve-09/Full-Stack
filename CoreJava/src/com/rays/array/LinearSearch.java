package com.rays.array;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {10, 11, 5, 13, 17, 88};
		
		int Search = 13;
		
		for(int i=0; i<=arr.length; i++) {
			
			if(arr[i] == Search) {
				
				System.out.println("Element found at index " + i);
				break;
			}
		}
	}
}
