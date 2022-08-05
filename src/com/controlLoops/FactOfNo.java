package com.controlLoops;

import java.util.Scanner;

public class FactOfNo {

	public static void main(String[] args) {
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of "+n+"is "+fact);

	}

}
