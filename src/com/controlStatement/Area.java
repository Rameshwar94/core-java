package com.controlStatement;

import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
    char ch;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Enter Your Choice: \n Circle \n Rectangle \n Triangle");
	String area=sc.next();
	
	switch(area) {
	case "Circle":System.out.println("Enter radius:");
	Scanner scan=new Scanner(System.in);
	int r=scan.nextInt();
	double pi=3.14;
	System.out.println("Area of Circle:"+(pi*r*r));
	break;
	
	case "Rectangle":System.out.println("Enter lenth and Width:");
	int l=sc.nextInt();
	int w=sc.nextInt();
	System.out.println("Area of Rectangle:"+(l*w));
	break;
	
	case "Triangle":System.out.println("Enter height and base:");
	int h=sc.nextInt();
	int b=sc.nextInt();
	double t=(b*h)/2;
	System.out.println("Area of triangle:"+t);
	break;
	
	default:System.out.println("invalid choice");
	}
	System.out.println("do You want to continue(y/n):");
	ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	}
}
