package com.rays.collection.sorting.comparable;

public class MarksheetByGetSet implements Comparable<MarksheetByGetSet>  {

	private int rollNo;
	private String name;
	private int phy;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhy() {
		return phy;
	}
	
	public void setPhy(int phy) {
		this.phy = phy;
	}


	@Override
	public int compareTo(MarksheetByGetSet o) {
		
		return this.rollNo - o.rollNo;
	}

	
	
}
