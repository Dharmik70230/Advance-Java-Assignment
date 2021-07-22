package com.phoenix.vehicles.Main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.vehicles.Car;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("Hello");
		String s2 = "Hello";
		StringBuffer sb = new StringBuffer("Hello");
		if (s1.equals(sb)) {
			System.out.println("Same Contents");
		} else {
			System.out.println("Different Contents");
		}

		Car car1 = new Car(1, "Duster", 1300000.00f);
		Car car2 = new Car(2, "Duster", 1300000.00f);

		if (car1.equals(car2)) {
			System.out.println("Same Car");
		} else {
			System.out.println("Different Car");
		}

		if (car1.equals(s1)) {
			System.out.println("Same Car");
		} else {
			System.out.println("Different Car");
		}

	}

}
