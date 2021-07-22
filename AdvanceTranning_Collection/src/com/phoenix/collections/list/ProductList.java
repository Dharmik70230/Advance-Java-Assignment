package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.ProductBrandComparator;
import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.comparators.ProductPriceComprator;
import com.phoenix.models.Product;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1002,"Mobile","POCO",25000.00f));
		productList.add(new Product(1004,"Laptop","Lenovo",50000.00f));
		productList.add(new Product(1006,"Refrigerator","LG",20000.00f));
		productList.add(new Product(1003,"TV","Sony",80000.00f));
		productList.add(new Product(1002,"Mobile","POCO",25000.00f));

		System.out.println(">>>Before Shorting");
		for(Product products : productList) {
			System.out.println(products);
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Acsending order" );
		Collections.sort(productList);
		for(Product products : productList) {
			System.out.println(products);
		}

		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Decsending order" );
		Collections.sort(productList,Collections.reverseOrder());
		for(Product products : productList) {
			System.out.println(products);
		}

		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Acsending order Of NAME" );
		Comparator<Product> cNm= new ProductNameComparator();
		Collections.sort(productList,cNm);
		for(Product products : productList) {
			System.out.println(products);
		}

		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Decsending order Of NAME" );
		
		Collections.sort(productList,cNm.reversed());
		for(Product products : productList) {
			System.out.println(products);
		}

		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Acsending order Of BRAND" );
		Comparator<Product> cBr= new ProductBrandComparator();
		Collections.sort(productList,cBr);
		for(Product p : productList) {
			System.out.println(p);
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Decsending order Of BRAND" );
		Collections.sort(productList,cBr.reversed());
		for(Product p : productList) {
			System.out.println(p);
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Acsending order Of Price" );
		Comparator<Product> cPr= new ProductPriceComprator();
		Collections.sort(productList,cPr);
		for(Product p : productList) {
			System.out.println(p);
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println(">>>Shorting acording to Decsending order Of Price" );
		Collections.sort(productList,cPr.reversed());
		for(Product p : productList) {
			System.out.println(p);
		}

		}
	}


