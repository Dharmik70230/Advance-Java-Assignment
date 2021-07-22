package com.phoenix.stack;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class NumStArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.addLast(40);
		stack.addLast(20);
		stack.addLast(70);
		stack.addLast(10);
		stack.addLast(80);
		
		System.out.println("Top of stack : " + stack.peekLast());
		System.out.println("POll of stack : " + stack.pollLast());
		System.out.println("Top of stack : " + stack.peekLast());
		
		while(!stack.isEmpty()) {
			System.out.println("Top of stack : " + stack.pollLast());
		}
		
	}

}
