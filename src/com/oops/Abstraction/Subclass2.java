package com.oops.Abstraction;

public class Subclass2 extends Parent {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second Subclass");
	}
public static void main(String[] args) {
	Subclass1 s1=new Subclass1();
	Subclass2 s2=new Subclass2();
	s1.message();
	s2.message();
}
}
