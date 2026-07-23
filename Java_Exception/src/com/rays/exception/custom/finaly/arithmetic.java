package com.rays.exception.custom.finaly;

public class arithmetic {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 20;
		
		
		try {
			int c  = b/a;
			System.out.println(c);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Always execute");
		}
	}
}
