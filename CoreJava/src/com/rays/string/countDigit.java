package com.rays.string;

public class countDigit {
	
	public static void main(String[] args) {
		
		String str = "go1o4g5464562le9";
		
		int count  = 0; 
	
	                        	
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
		   
				count++; 
			}
		}
		
		System.out.println("total no of digit " + count);
	}

}
