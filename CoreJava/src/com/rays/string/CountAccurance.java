package com.rays.string;

public class CountAccurance {

	public static void main(String[] args) {
		
		String str = "happy";
		
		int count  = 0;
		
		char c = 'p';
		
		for(int i=0; i<str.length(); i++) {
			
			if(c == str.charAt(i)) {
				
				count++;
			}
		}
		
		System.out.println("p = " + count);
	}
}
