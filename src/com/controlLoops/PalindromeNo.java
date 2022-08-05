package com.controlLoops;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		System.out.println("Enter No:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		while(n>0) {
		int	d=n%10;
			sum=d+(sum*10);
			n=n/10;
		}
		if(sum==m) {
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("no is not palindrome");
		}

	}

}
