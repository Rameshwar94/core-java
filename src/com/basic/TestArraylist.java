package com.basic;

import java.util.ArrayList;
import java.util.List;

public class TestArraylist {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		Object object=list.get(list.size());
		System.out.println(object);
		System.out.println(list.get(0));
	}
	
}
