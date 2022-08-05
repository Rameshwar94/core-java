package com.controlLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter no:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum of digits:"+sum);
	}

}
