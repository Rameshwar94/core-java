package com.collection;

import java.util.ArrayList;

public class StringList {

	public static void main(String[] args) {
		ArrayList<String> sl=new ArrayList<String>();
		sl.add("java");
		sl.add("Spring");
		sl.add("Hibernate");
		sl.add("Angular");
		for(String str:sl) {
			System.out.println(str);
		}
		sl.add(1, "HTML");
		sl.add(1,"CSS");
		
		System.out.println("list after insertion:");
		for(String str:sl) {
			System.out.println(str);
		}
		
	}

}
