package com.oops;

import java.util.Scanner;

public class PrameterisedEx {
	public void add(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("Substraction:"+(a-b));
	}
	public int multi(int a,int b) {
	return a*b;
}
		public double div(int a,int b) {
			return a/b;
		}
		public int mod(int a,int b) {
			return a%b;
		}

	public static void main(String[] args) {
		System.out.println("enter no:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    int	b=sc.nextInt();
	    PrameterisedEx p=new PrameterisedEx();
	    p.add(a, b);
	    p.sub(a, b);
	    System.out.println("Multiplication:"+p.multi(a, b));
	    System.out.println("Division:"+p.div(a, b));
	    System.out.println("Modulus:"+p.mod(a, b));
	}

}
