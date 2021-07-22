package com.phoenix.inner;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

public class StaticAccount {
	
	
	//static inner class
	public  static class Info{
		public static String name;
		private static int accountNo;
		public Info() {
			// TODO Auto-generated constructor stub
			name = "Dharmik";
			accountNo = 854125465;
		}
		public void accinfo() {
			
			System.out.println( "Account Name : " + name);
			System.out.println( "Account Number : " + accountNo);
		}
	}
	
	
}
