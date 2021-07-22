package com.phoenix.vehicles.Main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.vehicles.Car;

public class HashcodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println("Hashcode of s1"  + s1.hashCode());
		System.out.println("Hashcode of s2"  + s2.hashCode());
		
		Car car1 = new Car(1,"Duster" ,1300000.00f );
		Car car2 = new Car(2,"Nano" ,13000.00f );
		
		System.out.println("Hashcode of car1 :"  + car1.hashCode());
		System.out.println("Hashcode of car2 :"  + car2.hashCode());
		
		if(s1.equals(s2)) {
			System.out.println("YES");
		}else
			System.out.println("NO");
		
		if(car1.equals(car2)) {
			System.out.println("YES");
		}else
			System.out.println("NO");
	}

}
