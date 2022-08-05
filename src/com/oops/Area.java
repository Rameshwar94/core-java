package com.oops;

import java.util.Scanner;

public class Area {
	double pi=3.14;
	int r,s;
	public void areaOfCircle() {
		System.out.println("Find Area Of Circle");
		System.out.println("Enter radius:");
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		double pi=3.14;
		System.out.println("Area of Circle:"+(pi*r*r));

	}
	public void areaOfSquare() {
		System.out.println("Find area of Square");
		System.out.println("Enter side of square:");
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		System.out.println("Area of Square:"+(s*s));
	}
	public int areaOfRectangle() {
		System.out.println("Find Area of Rectangle");
		System.out.println("Enter lenth and Width:");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		int a=w*l;
		return a;
	}
	public double areaOfTriangle() {
		System.out.println("Find Area of Triagle");
		System.out.println("Enter height and base:");
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int b=sc.nextInt();
		double t=(b*h)/2;
		return t;
	}

	public static void main(String[] args) {
		Area a=new Area();
		a.areaOfCircle();
		a.areaOfSquare();
		System.out.println("Area of Rectangle:"+a.areaOfRectangle());
		System.out.println("Area of Triangle:"+a.areaOfTriangle());

	}

}
