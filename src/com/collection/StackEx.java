package com.collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.add("java");
		s.add("Stack");
		s.add("vector");
		s.add("array");
		s.add("array");
		s.add(null);
		s.push("push");
		s.push("push1");
		System.out.println(s);
		System.out.println("Removing elements:"+s.pop());
		s.remove("array");
		System.out.println(s);
		System.out.println("Searching elements:"+s.search("vector"));
		System.out.println(s.search("push1"));//does not present in stack
		
	}

}
