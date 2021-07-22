package com.phoenix.inner.main;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

import com.phoenix.inner.Account;

public class SimpleInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.setAccountNo(123456789);
		ac.setName("Dharmik");
		
		Account.Info i = ac.new Info();
		i.accinfo();
	}

}
