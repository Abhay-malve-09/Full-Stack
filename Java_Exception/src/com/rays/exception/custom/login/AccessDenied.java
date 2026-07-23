package com.rays.exception.custom.login;

public class AccessDenied {

	public static void main(String[] args) {

		String name = "root1";
        String pass = "root";
        
		if (name.equals("root") && pass.equals("root")) {
			System.out.println("Access");
		} else {
			throw new TestAccessDenied();
		}

	}
}
