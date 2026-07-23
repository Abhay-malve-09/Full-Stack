package com.rays.exception.custom.login;

public class TestDuplicateRecordException extends RuntimeException{

	public TestDuplicateRecordException() {
		
		super("Duplicate Records Found");
	}
}
