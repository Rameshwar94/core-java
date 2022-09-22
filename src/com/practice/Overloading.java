package com.practice;

public class Overloading {
	public void data(short i) {
		System.out.println("short");
	}
	public void data(int i) {
		System.out.println("int");
	}
	public void data(float i) {
		System.out.println("float");
	}
	public void data(double i) {
		System.out.println("double");
	}
	  

	public static void main(String[] args) {
		 short f;
		Overloading o=new Overloading();
		o.data(3);
		o.data(2.5);
		o.data((short)6);
		o.data(5.6f);
       
        f=5/2;
        System.out.println(f);
	}

}
