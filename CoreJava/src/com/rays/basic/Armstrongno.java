package com.rays.basic;

public class Armstrongno {

	public static void main(String[] args) {

		int no = 153;

		int a = no % 10;

		int b = (no / 10) % 10;

		int c = no / 100;

		int sum = a * a * a + b * b * b + c * c * c;

		if (sum == no) {

			System.out.println("No is Armstrong");

		} else {

			System.out.println("No is not Armstrong");

		}

	}
}
