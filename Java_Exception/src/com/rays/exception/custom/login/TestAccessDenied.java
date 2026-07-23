package com.rays.exception.custom.login;

public class TestAccessDenied extends RuntimeException{

	public TestAccessDenied() {
		super("Access Denied");
	}
}
