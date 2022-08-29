package com.java8features;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("thane");
		list.add("pune");
		list.add("hadpsar");
		list.add("navi mumbai");
		list.add("mumbai");
		
		list.forEach(str-> System.out.println(str));
	}

}
