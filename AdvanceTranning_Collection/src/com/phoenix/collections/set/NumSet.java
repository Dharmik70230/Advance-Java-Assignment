package com.phoenix.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.phoenix.comparators.CompareNum;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class NumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> numSet = new HashSet<Integer>();
		//Set<Integer> numSet = new LinkedHashSet<Integer>();//unordered
		//Set<Integer> numSet = new TreeSet<Integer>();
		//Set<Integer> numSet = new TreeSet<Integer>(new CompareNum());//ordered
		TreeSet<Integer> numSet = new TreeSet<Integer>(Collections.reverseOrder());
		numSet.add(120);
		numSet.add(10);
		numSet.add(28);
		numSet.add(128);
		numSet.add(96);
		numSet.add(120);
		
		System.out.println(numSet);
		
		System.out.println("For Each Loop");
		for(int set : numSet) {
			System.out.println(set);
		}
		
		System.out.println("User  Iterator");
		Iterator<Integer> it = numSet.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			System.out.println(ele);
		}
		
		
	}

}
