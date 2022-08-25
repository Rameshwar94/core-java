package com.basic;

import java.util.Scanner;

public class CountDigits {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		int c=countDigit(n);
		if(c==-1) {
			System.out.println("invalid input");
		}
		else
			System.out.println(c);
	}

	public static int countDigit(int n) {
		if(n<0) {
			count=-1;
		}
		else {
		while(n>0) {
			int m=n%10;
			count++;
			n=n/10;
		}
		}
		return count;
	}

}
