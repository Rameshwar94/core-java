package com.controlStatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter No:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}

	}

}
