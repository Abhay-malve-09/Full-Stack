package com.rays.exception.custom;

public class InsufficientFundException extends RuntimeException {

	public InsufficientFundException() {
		super("Insufficient Fund");
	}
}
