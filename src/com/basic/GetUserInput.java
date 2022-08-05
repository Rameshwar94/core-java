package com.basic;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nos for addition:");
		int	a=sc.nextInt();
		int	b=sc.nextInt();
		System.out.println("result:"+(a+b));
		System.out.println("enter nos for substration:");
		int	c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("result:"+(c-d));
		System.out.println("enter nos for multiplication:");
		int	e=sc.nextInt();
		int f=sc.nextInt();
		System.out.println("result:"+(e*f));
		System.out.println("enter nos for division:");
		int	g=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("result:"+(g/h));
		System.out.println("enter nos for modulus:");
		int	i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println("result:"+(i%j));
	}

}
