package com.phoenix.inner;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

public class Car {

	Ferrari f = new Ferrari() {
		private String model;
		{
			model = "Ferrari..";
		}
		public void showModel() {
			System.out.println(model);
		}
		public void test() {
			System.out.println("Anonymous : " + model);
		}
		
	};
}
