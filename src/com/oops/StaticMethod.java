package com.oops;

public class StaticMethod {
	public static void add(int a,int b) {
		System.out.println("add:"+(a+b));
	}

	static {
		System.out.println("it will execute befor main()");
	}
	public static void main(String[] args) {
		
		add(12,11);
		StaticMethod.add(13, 23);
	}

}
//we can overload static method