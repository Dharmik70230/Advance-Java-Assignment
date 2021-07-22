package com.phoenix.enums;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

public enum WeekDay {

	
	MONDAY,TUESDAY(20,"Tues"),WEDNESDAY(43),THURSDAY,FRIDAY(67,"FRI"),SATURDAY,SUNDAY(50);
	
	
	private int dayNo;
	private String shortName;
	
	private WeekDay() {
		// TODO Auto-generated constructor stub
		dayNo = 1;
		System.out.println("Default Constructor");
	}
	private WeekDay(int dayNo) {
		// TODO Auto-generated constructor stub
		this.dayNo = dayNo;
		System.out.println("Single Parameterized Constructor");
	}
	private WeekDay(int dayNo,String sortName) {
		// TODO Auto-generated constructor stub
		this.dayNo = dayNo;
		this.shortName = sortName;
		System.out.println("Two Parameterized Constructor");
	}
	public int getDayNo() {
		return dayNo;
	}
	public String getShortName() {
		return shortName;
	}
	
	
}
