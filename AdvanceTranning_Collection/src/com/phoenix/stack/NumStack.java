package com.phoenix.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class NumStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(40);
		st.push(20);
		st.push(70);
		st.push(55);
		st.push(80);
		
		System.out.println("Top of the Stack : " + st.peek());
		int idx = st.search(70);
		System.out.println("ELemnet 70 is Found at : " + idx);
		System.out.println("Pop of Top :" + st.pop());
		
		while(!st.empty()) {
			System.out.println("Pop of Top :" + st.pop());
		}
		//System.out.println("Top of the Stack : " + st.peek());
	}  

}
