package com.controlLoops;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0;
		
		System.out.println("Multiplication table for "+n+":");
		for(int i=1;i<=10;i++) {
			m=n*i;
			System.out.println(m);
			m=0;
		}
	}

}
