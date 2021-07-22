package com.phoenix.queues;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class NumDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Deque<Integer> deq = new LinkedList<Integer>();
		Deque<Integer> deq = new ArrayDeque<Integer>();
		deq.add(100);
		deq.add(200);
		deq.addFirst(150);
		deq.addFirst(180);
		deq.addLast(120);
		deq.addLast(130);
		System.out.println("Front of the deq :" + deq.peek());
		System.out.println("First of the deq :" + deq.peekFirst());
		System.out.println("Last of the deq :" + deq.peekLast());
		
		System.out.println("Poll of the deq :" + deq.poll());

		System.out.println("Poll First of the deq :" + deq.pollFirst());
		System.out.println("Poll Last of the deq :" + deq.pollLast());
	}

}
