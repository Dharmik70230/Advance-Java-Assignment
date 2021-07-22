package com.phoenix.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Double> set = new TreeSet<Double>();
		set.add(5.6);
		set.add(3.2);
		set.add(8.5);
		set.add(2.1);
		set.add(6.2);
		set.add(5.0);
		set.add(7.3);
		System.out.println("Set in Acsending Order");

		for(double s : set) {
			System.out.println(s);
			
		}	
		System.out.println("-----------------------------------------");
		System.out.println("Ceiling of  5.6 is "  + set.ceiling(5.6));
		System.out.println("Ceiling of  5.8 is "  + set.ceiling(5.8));
		System.out.println("Ceiling of  8.6 is "  + set.ceiling(8.6));
		System.out.println("-----------------------------------------");
		System.out.println("Floor of  5.6 is "  + set.floor(5.6));
		System.out.println("Floor of  5.3 is "  + set.floor(5.3));
		System.out.println("Floor of 2.0 is "  + set.floor(2.0));
		System.out.println("-----------------------------------------");
		System.out.println("Higher of 5.6 is "  + set.higher(5.6));
		System.out.println("Higher of 5.8 is "  + set.higher(5.8));
		System.out.println("Higher of 8.6 is "  + set.higher(8.6));
		System.out.println("-----------------------------------------");
		System.out.println("Lower of 5.6 is "  + set.lower(5.6));
		System.out.println("Lower of 5.3 is "  + set.lower(5.3));
		System.out.println("Lower of 2.0 is "  + set.lower(2.0));
	}

}
