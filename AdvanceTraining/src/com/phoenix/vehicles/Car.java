package com.phoenix.vehicles;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.annotations.CopyrightInfo;
@CopyrightInfo(auther = "STL")
public class Car {
	@CopyrightInfo(auther = "STL")
	private int id;
	private String model;
	private float price;

	public static int count;
	
	public Car() {
		count++;
	}
	
	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		count++;
	}
	@CopyrightInfo(auther = "STL")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}
	//overriding euqals methods  
	public boolean equals(Object ob) {

		if (ob instanceof Car) {
			Car car = (Car) ob;
			if (this.id == car.id && this.model.equals(car.model) && this.price == car.price) {
				return true;
			}
		}
		return false;
	}
	public int hashcode() {
		return id + model.hashCode() + (int)price;
	}

}
