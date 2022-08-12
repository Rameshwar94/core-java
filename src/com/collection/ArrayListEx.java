package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();//non generic
		list.add("premala");
		list.add("siddhi");
		list.add(12);
		list.add(null);
		list.add('a');
		list.add(1, "premala");
		System.out.println("non generic list:"+list);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("nagtilak");
		al1.add("chavan");
		al1.add("premala");
		System.out.println(al1);
		//inserting one list to another one
		System.out.println("inserting one list to another one:");
		al1.addAll(list);
		System.out.println(al1);
		System.out.println("removing one list from another one:");
		al1.removeAll(list);
		//after removing common elements in list will removed along with removed list elements
		System.out.println(al1);
		
		System.out.println("print using iterator:");
		//iterating elements by iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<String> al=new ArrayList<String>();//generic ,<>:diamond operator
		al.add("premala");
		al.add("siddhi");
		al.add("ram");
		System.out.println("Generic list:"+al);
		System.out.println("print using For each:");
		for (String str:al) {
			System.out.println(str);
		}
	}

}
