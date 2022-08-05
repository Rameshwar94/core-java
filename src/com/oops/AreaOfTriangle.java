package com.oops;

public class AreaOfTriangle {
	int b,h;
	int a;
	public AreaOfTriangle() {
		b=2;
		h=3;
	}
	public AreaOfTriangle(int b,int h) {
		this.b=b;
		this.h=h;
	}
	public void area() {
		System.out.println("Area of triangle:"+(b*h)/2);
	}

	public static void main(String[] args) {
		AreaOfTriangle t=new AreaOfTriangle();
		t.area();
		AreaOfTriangle t1=new AreaOfTriangle(4,5);
		t1.area();

	}

}
