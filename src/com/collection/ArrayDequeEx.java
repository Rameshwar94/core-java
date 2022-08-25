package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<String>();
	//	deque.add(null);
		deque.add("coffee");
		deque.add("Tea");
		deque.add("Ice-Cream");
		deque.add("Cold-Drink");
		deque.add("Tea");
		
	//	deque.offer(null);
		deque.offer("pizza");
		deque.offerFirst("burger");
		deque.offerLast("Sandwitch");
		System.out.println("Removing 1st element:");
		deque.pollFirst();
		for ( String string : deque) {
			System.out.println(string);
		}
		System.out.println("\n removing last element:");
		deque.pollLast();
		for ( String string : deque) {
			System.out.println(string);
		}
	}

}
