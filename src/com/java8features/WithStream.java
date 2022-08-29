package com.java8features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Ram");
		list.add("siddhi");
		list.add("premala");
		list.add("Rameshwar");
		list.add("Riya");
		list.add("Siddhu");
		//filter is intermediate operation
		//for predicate functional interface we implemented lambda expression
		//here count () method is terminal operation
		long count=list.stream().filter(str->str.length()<5).count();//return type of count() method is long so we used long count variable
		System.out.println("there are "+count+" strings with less than 5 length");

	}

}
