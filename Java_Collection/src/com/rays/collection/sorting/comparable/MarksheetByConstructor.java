package com.rays.collection.sorting.comparable;

public class MarksheetByConstructor implements Comparable<MarksheetByConstructor> {

	private int rollNo;
	private String name;
	private int phy;

	public MarksheetByConstructor(int rollNo, String name, int phy) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
	}

	

	@Override
	public String toString() {
		return "MarksheetByConstructor [rollNo=" + rollNo + ", name=" + name + ", phy=" + phy + "]";
	}



	@Override
	public int compareTo(MarksheetByConstructor o) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " vs " + o.name);
		//return this.rollNo - o.rollNo;
		return this.name.compareTo(o.name);
	}



	
}
