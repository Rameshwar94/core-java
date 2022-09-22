package com.basic;

import java.util.Scanner;

public class OccuranceOfDigit {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		System.out.println("Enter digit to check occurence:");
		int d=sc.nextInt();
		if(n<0||d<0) {
			System.out.println("number is too small");
			System.exit(0);
		}
		else if(n>32767||d>=10) {
			System.out.println("no too large");
			System.exit(0);
		}
		else {
			while(n>0) {
				int m=n%10;
				if(m==d) {
					count++;
				}
				n=n/10;
			}
		}
		System.out.println(count);
	}

}
