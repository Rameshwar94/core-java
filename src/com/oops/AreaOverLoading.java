package com.oops;

public class AreaOverLoading {
	public void area(int r) {
		double pi=3.14;
		System.out.println("Area of Circle:"+(pi*r*r));
		
	}
	public void area(int l,int w) {
		System.out.println("Area of rectangle:"+(l*w));
	}

	public static void main(String[] args) {
		
		AreaOverLoading a=new AreaOverLoading();
		a.area(5);
		a.area(2, 3);
	}

}
