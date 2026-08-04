package com.rays.collection.sorting.comparator;

import java.util.Comparator;

public class OrderByProductName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.productname.compareTo(o2.productname); //asc
	}

}