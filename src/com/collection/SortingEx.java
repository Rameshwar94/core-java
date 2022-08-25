package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SortingEx {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("siddhi");
		ll.add("premala");
		ll.add("ram");
	//	ll.add(null);//gives run time error
		ll.add("siddhi");
		ll.add("Nagtilak");
		Collections.sort(ll);
		System.out.println("sorted list:");
		for(String str:ll) {
			System.out.println(str);
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(78);
		al.add(67);
		al.add(1);
		Collections.sort(al);
		System.out.println("\nAfter Sorting:");
		for(Integer integer:al) {
			System.out.println(integer);
		}
	}

}
