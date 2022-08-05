package com.oops;

import java.util.Scanner;

public class Arithmatic {
	int a,b,c;
public void accept() {
	System.out.println("enter no:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add() {
		System.out.println("Addition:"+(a+b));
	}
	public void sub() {
		System.out.println("Substraction:"+(a-b));
	}
	public int multi() {
	return a*b;
}
		public double div() {
			return a/b;
		}
		public int mod() {
			return a%b;
		}

	public static void main(String[] args) {
		Arithmatic a=new Arithmatic();
		a.accept();
		a.add();
		a.sub();
		System.out.println("Multiplication:"+a.multi());
		System.out.println("Division:"+a.div());
		System.out.println("modulus:"+a.mod());
	}

}
