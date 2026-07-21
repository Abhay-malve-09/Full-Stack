package com.rays.exception;

public class TestArithmeticWithTryCatch {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 20;
		
		try {
				int div  = b/a;    //ArithmeticException
				System.out.println(div);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program finished");
	}
}
