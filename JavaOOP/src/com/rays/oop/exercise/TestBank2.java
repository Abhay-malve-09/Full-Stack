package com.rays.oop.exercise;

public class TestBank2 {

	public static void main(String[] args) {
		
		Bank b1 = new AxisBank();
		
		//type casting parent to child
		
		AxisBank ax  = (AxisBank) b1;
		
		ax.getName();
		ax.setNameOfAxis("AXIS BANK");
		ax.setInterestRateOfAxis(11.1);
		
		
		System.out.println("Name: " + ax.getName());
		System.out.println("InterestRate of Axis bank: " + ax.getInterestRate() + "%");
		
		Bank b2 = new IciciBank();
		//type casting parent to child
		
		IciciBank ic = (IciciBank) b2;
		
		ic.setNameOfIcici("ICICI BANK");
		ic.setInterestRateOfIcici(9.8);
		
		System.out.println("Name: " + ic.getName());
		System.out.println("InterestRate of Icici Bank: " + ic.getInterestRate() + "%");
		
		
		Bank b3 = new SbiBank();
		
		//type casting parent to child
		
		SbiBank sb = (SbiBank) b3;
		
		sb.setNameOfSbi("SBI BANK");
		sb.setInterestRateOfSbi(10.00);
		
		System.out.println("Name: " + sb.getName());
		System.out.println("InterestRate of Sbi Bank: " + sb.getInterestRate() + "%");
		
		
		
	}
}
