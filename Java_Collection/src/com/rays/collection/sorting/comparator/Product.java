package com.rays.collection.sorting.comparator;

import java.util.Comparator;

public class Product {

	public String productname;
	public int productPrice;
	public String productCategory;
	
	public Product(String pn, int pp, String pc) {
		this.productname = pn;
		this.productPrice = pp;
		this.productCategory = pc;
	}

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", productPrice=" + productPrice + ", productCategory="
				+ productCategory + "]";
	}
}
