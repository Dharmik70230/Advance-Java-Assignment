package com.phoenix.string.main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.annotations.CopyrightInfo;
import com.phoenix.vehicles.Car;

public class StringDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Hello";
		String s2  = "Hello";
		StringBuffer sb = new StringBuffer();
		if(s1==s2){
			System.out.println("Same object");
		}else {
			System.out.println("Different object");
			
		}
		Car car1 = new Car(1,"Duster" ,1300000.00f );
		Car car2 = new Car(1,"Duster" ,1300000.00f );
		
		if(car1 == car2) {
			System.out.println("Same Car");
	}else {
		System.out.println("Different Car");
	}
		
	}

}
