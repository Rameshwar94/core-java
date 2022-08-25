package com.basic;

import java.util.Scanner;

//problem statement is in multithreadingTheory File
public class ProductOfPrimeDigit {
	static int prod=1;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		int p=productPrimeDigits(n);
		if(p==-1) {
			System.out.println("invalid input");
		}
		else {
			System.out.println(p);
		}

	}

	public static int productPrimeDigits(int n) {
		
		if(n<0||n>32767) {
			 prod = -1;
		}
		else {
			while(n>0) {
				int m=n%10;
				if(m==0||m==1) {
					prod=prod*1;
				}
				else {
				int count=0;
				int c=m/2;
				for(int i=2;i<=c;i++) {
					if(m%i==0) {
						count++;
					}
				}
				if(count==0) {
					prod=prod*m;
				}
				}
				n=n/10;
			}
		}
		return prod;
		
	}

}
