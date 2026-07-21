package com.rays.oop.overriding;

public class TestBank {
	public static void main(String[] args) {
		
	Bank ba = new Bank();
		
	System.out.println(ba.getName());
	System.out.println(ba.getInterestRate());
	
	Bank b = new AxisBank();

   System.out.println(b.getName());
   System.out.println(b.getInterestRate());
	
	
   Bank b1 = new HDFCBank();
   
   System.out.println(b1.getName());
   System.out.println(b1.getInterestRate());
   
   Bank b2 = new ICICIBank();
   
   
   System.out.println(b2.getName());
   System.out.println(b2.getInterestRate());
   
}
}