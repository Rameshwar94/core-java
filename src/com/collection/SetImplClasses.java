package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplClasses {

	public static void main(String[] args) {
		Set<String> hset=new HashSet<String>();
		hset.add("Apple");
		hset.add("mango");
		hset.add("banana");
		hset.add("guava");
		hset.add(null);
		hset.add("Apple");
		System.out.println("Implementing HashSet:");
		for (String string : hset) {
			System.out.println(string);
		}
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("pizza");
		lhs.add("coffee");
		lhs.add("biryani");
		lhs.add("burger");
		lhs.add("Noodles");
		lhs.add("pizza");
		lhs.add(null);
		System.out.println("\nImplementing LinkedHashSet:");
		for (String string : lhs) {
			System.out.println(string);
		}
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("mogra");
		ts.add("lotus");
		ts.add("jasmin");
		ts.add("mogra");
	//	ts.add(null);//can't insert null .it will give NullPointerException
		System.out.println("\nImplementing TreeSet:");
		for (String string : ts) {
			System.out.println(string);
			
		}
	}

}
