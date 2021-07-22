package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ListArrayDemo {

	public static void main(String args[]) {
		//Array to list
		List<Integer> numList = Arrays.asList(100,1500,200,300,400,500);
	//	numList.forEach(System.out::println);
	//	numList.add();
		
		//list to array
		Integer iArr[] = new Integer[numList.size()];
		iArr = numList.toArray(iArr);
		for(int ele:iArr)
			System.out.println(ele);
	}
}
