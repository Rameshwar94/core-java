package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("siddhi");
		ll.add("premala");
		ll.add("ram");
		ll.add(null);
		ll.add("siddhi");
		
		System.out.println("using iterator:");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nusing for each:");
		for(String str:ll) {
			System.out.println(str);
		}
		
		ListIterator<String> itr1= ll.listIterator();
		
		System.out.println("\nUsing ListIterator Forword Direction:");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("\nUsing ListIterator backword direction:");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		
		
		
	}

}
