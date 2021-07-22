package com.phoenix.string.main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

public class StringBufferDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Leangth : " + sb.length());
		sb.append("Hello");
		
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Leangth : " + sb.length());
		
		sb.append("This is String BUffer");
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Leangth : " + sb.length());
		 sb.reverse();
		System.out.println("Capacity : " + sb.capacity());
		System.out.println("Leangth : " + sb.length());

		String s = sb.reverse().toString();
		System.out.println(s);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hello World");
		sb1.insert(6, "Great ");
		System.out.println(sb1);
		sb1.replace(6, 11, "XXXXX");
		System.out.println(sb1);

	}

}
