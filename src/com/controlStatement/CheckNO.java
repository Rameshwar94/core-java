package com.controlStatement;

import java.util.Scanner;

public class CheckNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("positive no");
		}
		else if(a<0) {
			System.out.println("negative no");
		}
		else {
			System.out.println("no is zero");
		}
	}

}
