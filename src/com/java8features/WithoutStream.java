package com.java8features;

import java.util.ArrayList;

public class WithoutStream {
//for large amount of data without stream is time consuming because it works sequentially
	//but Stream works parallel
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Ram");
		list.add("siddhi");
		list.add("premala");
		list.add("Rameshwar");
		list.add("Riya");
		list.add("Siddhu");
		int count=0;
		for(String str:list) {
			if(str.length()<5) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
