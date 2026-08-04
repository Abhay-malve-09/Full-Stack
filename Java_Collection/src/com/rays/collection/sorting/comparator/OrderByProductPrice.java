package com.rays.collection.sorting.comparator;

import java.util.Comparator;

public class OrderByProductPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.productPrice - o2.productPrice; //asc
	}

}
