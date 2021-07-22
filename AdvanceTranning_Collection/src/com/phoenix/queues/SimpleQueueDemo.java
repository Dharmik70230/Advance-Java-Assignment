package com.phoenix.queues;
/*
 * @author dharmik.maru@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueueDemo {

	public static void main(String args[]) {
		
		//<Integer> numQ = new LinkedList<Integer>();
		//Queue<Integer> numQ = new PriorityQueue<Integer>();
		//Queue<Integer> numQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		Queue<Integer> numQ = new PriorityQueue<Integer>();
		numQ.add(100);
		numQ.add(50);
		numQ.add(20);
		numQ.add(70);
		numQ.add(25);
		numQ.add(50);
		
		System.out.println("Head no numQ : " + numQ.peek());
		System.out.println("Rem//oving  Head  : " + numQ.poll());
		System.out.println("Head no numQ : " + numQ.peek());
		
		while(!numQ.isEmpty()) {
			System.out.println("Polling  Head  : " + numQ.poll());
		}
		System.out.println("Head no numQ : " + numQ.peek());
		//System.out.println("Head no numQ : " + numQ.element());
		//System.out.println("Polling  Head  : " + numQ.remove());
	}
}
