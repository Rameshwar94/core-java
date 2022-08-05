package com.oops;

public class OverLoadingEx {
	public void add(int a,int b,int c) {
		System.out.println("addition:"+(a+b+c));
		
	}
	public void add(float x,float y) {
		System.out.println("Addition:"+(x+y));
	}
	
	public static void main(String[] args) {
		OverLoadingEx o=new OverLoadingEx();
		o.add(1, 23, 12);
		o.add(12.4f, 23.2f);

	}

}
