package com.basic;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		System.out.println("Enter radius:");
		double pi=3.14;
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("Area of Circle:"+(pi*r*r));
		System.out.println("Enter lenth and Width:");
		int l=sc.nextInt();
		int w=sc.nextInt();
		System.out.println("Area of Rectangle:"+(l*w));
		System.out.println("Enter height and base:");
		int h=sc.nextInt();
		int b=sc.nextInt();
		double t=(b*h)/2;
		System.out.println("Area of triangle:"+t);
		
	}

}
