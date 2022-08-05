package com.basic;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,p,t,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount:");	
		p=sc.nextInt();
		System.out.println("Enter rate of Intrest:");
		r=sc.nextInt();
		System.out.println("Enter time duration (years):");
		t=sc.nextInt();
		s=(p*r*t)/100;
		System.out.println("Simple Intrest:"+s);

	}

}
