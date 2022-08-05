package com.oops;

public class ThisDemo {
	String str;
	int n;
	public ThisDemo() {
		this("Hello user");
		
	}
	public ThisDemo(String str) {
		this.str=str;
	}
	
	public void display() {
		System.out.println(str);
		System.out.println(str+1);
	}
	public static void main(String[] args) {
		ThisDemo d=new ThisDemo();
		d.display();
	}

}
