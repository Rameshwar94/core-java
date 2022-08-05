package com.controlLoops;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		while(n>0) {
			int d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		if(m==sum) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
	}

}
