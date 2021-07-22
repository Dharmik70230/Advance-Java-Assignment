package com.phoenix.inner;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 12-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */

public class Account {

	private String name;
	private int accountNo;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String name, int acountNo) {
		// TODO Auto-generated constructor stub
		this.accountNo = accountNo;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	// simple inner class
	public class Info {

		public void accinfo() {

			System.out.println("Account Name : " + name);
			System.out.println("Account Number : " + accountNo);
		}
	}

}
