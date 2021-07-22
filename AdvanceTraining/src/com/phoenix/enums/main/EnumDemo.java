package com.phoenix.enums.main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.enums.Color;
import com.phoenix.enums.WeekDay;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Color.BLUE);
		Color fc = Color.GREEN;
		System.out.println(fc);
		
		System.out.println("Ordinal :" + Color.BLUE.ordinal() );
		System.out.println("Ordinal :" + fc.ordinal() );
		
		
		for(Color c : Color.values()) {
			System.out.println(c);
		}
///////////////////////////////////////////////////////////////////////			
			
		
			System.out.println(WeekDay.MONDAY);
			System.out.println("Ordinal :" + WeekDay.MONDAY.ordinal() );
			
			for(WeekDay w : WeekDay.values()) {
				System.out.println("Day : " + w + "  Ordinal : " + w.ordinal() );
				
			}
			WeekDay day = WeekDay.TUESDAY;
			switch(day) {
			case  MONDAY :
				System.out.println("MONDAY");
				break;
			case TUESDAY :
				System.out.println("TUESDAY");
				break;
			case  WEDNESDAY :
				System.out.println("WEDNESDAY");
				break;
			case  THURSDAY :
				System.out.println("THURSDAY");
				break;
			case  FRIDAY :
				System.out.println("FRIDAY");
				break;
			case  SATURDAY :
				System.out.println("SATURDAY");
				break;
			}
			
			System.out.println(WeekDay.FRIDAY);
			System.out.println("Ordinal :" + WeekDay.FRIDAY.ordinal() );
			System.out.println("Day Number :" + WeekDay.FRIDAY.getDayNo());
			System.out.println("Day Number :" + WeekDay.FRIDAY.getShortName());

			WeekDay today = WeekDay.TUESDAY;
			System.out.println(today);
			System.out.println("Ordinal :" + today.ordinal() );
			System.out.println("Day Number :" + today.getDayNo());
			System.out.println("Day Number :" +today.getShortName());
		}
	}


