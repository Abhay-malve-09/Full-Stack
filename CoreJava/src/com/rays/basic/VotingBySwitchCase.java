package com.rays.basic;

public class VotingBySwitchCase {

	public static void main(String[] args) {
		
		int age = 13;
		
		switch (age) {
		
		case  20:
			
			System.out.println("you are now eligible to vote");
			
			break;
			
		case 18:
			
			System.out.println("you are eligibe to vote");
			
			break;
			
		case 15:
			
			System.out.println("you are not eligible to vote");
			
			break;
			
			default :
				
				System.out.println("might be eligible for vote or note");
		}
	}
}
