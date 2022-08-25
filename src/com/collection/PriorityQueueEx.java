package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("lotus");
		queue.add("jasmin");
		queue.add("rose");
		queue.add("mogara");
		queue.add("rose");
		//queue.add(null);//can't insert null
		for (String string : queue) {
			System.out.println(string);
		}
		System.out.println("\nHead of Queue:"+queue.element());
		System.out.println("\nRemoving element using remove():"+queue.remove());
		System.out.println("\nAfter removing :");
		for (String string : queue) {
			System.out.println(string);
		}
		System.out.println("\nremoving element using poll:"+queue.poll());
		for (String string : queue) {
			System.out.println(string);
		}
	}

}
