package com.rays.collection.list.customList.marksheet;

public class Marksheet {

	private String name;
	private int rollNo;
	private int phy;
	private int chem;
	private int math;
	
	public Marksheet(String name, int rollNo, int phy, int chem, int math) {
		this.name = name;
		this.rollNo = rollNo;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
				
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + ", RollNo: " + rollNo + ", Phy: " + phy + ", Chem: " + chem + ", Math: " + math;
	}
}
