package com.phoenix.prop;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 20-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.Properties;

public class PropsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props = new Properties();
		
		props.setProperty("username", "jay");
		props.setProperty("password", "j123");
		
		String uname=  props.getProperty("username");
		String pwd=  props.getProperty("password","admin123");
		
		System.out.println(uname);
		System.out.println(pwd);
		
		
		
		
		
		
	}

}
