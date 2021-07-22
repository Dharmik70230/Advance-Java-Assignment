package com.phoenix.imports.main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.vehicles.Car;
import static com.phoenix.vehicles.Car.count;
import static java.lang.Integer.parseInt;
public class StaticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a  = Integer.parseInt("20");
		System.out.println(a);
		
		int b  = parseInt("21");
		System.out.println(b);

		System.out.println("No of Car Object :" + count);	
	
		Car c1 = new Car();
		Car c2 = new Car(121,"BMW " , 50000.00f);
	
		System.out.println("No of Car Object :" + count);
	}
	

}
