package com.phoenix.colection.searching;

import java.util.Arrays;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 14-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 50, 20, 30, 40, 90, 10 };
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		Arrays.stream(arr).forEach(System.out::println);

		int searchIdx = Arrays.binarySearch(arr, 120);
		System.out.println("Elemnet : " + searchIdx);
	}

}
