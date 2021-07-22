package com.phoenix.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.models.Product;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ProductSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> productSet = new HashSet<Product>();
		productSet.add(new Product(1002,"Mobile","POCO",25000.00f));
		productSet.add(new Product(1004,"Laptop","Lenovo",50000.00f));
		productSet.add(new Product(1006,"Refrigerator","LG",20000.00f));
		productSet.add(new Product(1003,"TV","Sony",80000.00f));
		productSet.add(new Product(1002,"Mobile","POCO",25000.00f));

		System.out.println("Before Shorting");
		for(Product products : productSet) {
			System.out.println(products);
		}
		
	}
}
