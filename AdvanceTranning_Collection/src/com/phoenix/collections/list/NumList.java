package com.phoenix.collections.list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.phoenix.comparators.CompareNum;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class NumList {

	public static void main(String args[]) {

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(130);
		numList.add(56);
		numList.add(16);
		numList.add(83);
		numList.add(189);
		numList.add(200);

		for (int i = 0; i < numList.size(); i++) {
			int ele = numList.get(i);
			System.out.println(ele);
		}
		
		System.out.println("User  Iterator");
		Iterator<Integer> it = numList.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
		}
		System.out.println("Sort the list");

		
		Collections.sort(numList);
		for (int list : numList) {
			System.out.println(list);
		}
		
		/*
		 * 
		 * Collections.reverse(numList); for (int list : numList) {
		 * System.out.println(list); }
		 */
		System.out.println("Sort the list Using CopmpareNum");
		 
		Collections.sort(numList, new CompareNum());
		for (int list : numList) {
			System.out.println(list);
		}
		Comparator<Integer>  c = Collections.reverseOrder();
		Collections.sort(numList,c);
		System.out.println("Sort the list Using reverseOrder()");
		for (int list : numList) {
			System.out.println(list);
		}
	}
}
