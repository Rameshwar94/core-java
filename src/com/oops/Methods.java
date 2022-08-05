package com.oops;

import java.util.Scanner;

public class Methods {
	int a,b;
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add() {
		int c=a+b;
		System.out.println("addition:"+c);
	}
	public int sub() {
		int c=a-b;
		return c;
		
	}

	public static void main(String[] args) {
		Methods o=new Methods();
		o.accept();
		o.add();
		int s=o.sub();
		System.out.println("substraction:"+s);
	}

}
