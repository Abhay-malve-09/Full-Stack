package com.rays.basic;

public class Calculator {
	public static void main(String[] args) {

		String opr = "%";

		int a = 10;

		int b = 20;

		switch (opr) {

		case "+":

			System.out.println(" result " + (a + b)); //30

			break;

		case "-":

			System.out.println(" result " + (a - b)); //-10

			break;

		case "*":

			System.out.println(" result " + (a * b)); //200

			break;

		case "/":

			System.out.println(" result " + (a / b)); //0

			break;

		case "%":

			System.out.println(" result " + (a % b)); //10`

			break;
		}
	}
}
