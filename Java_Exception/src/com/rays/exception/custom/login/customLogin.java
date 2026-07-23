package com.rays.exception.custom.login;

public class customLogin {

	public static void main(String[] args) {
		
		String name = "admin123";
		
		if(name.equals("admin")) {
			System.out.println("user found");
		} else {
			throw new TestCustomLogin();
		}
	}
}
