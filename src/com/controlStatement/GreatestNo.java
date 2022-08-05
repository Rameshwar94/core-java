package com.controlStatement;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 no:");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2&&n1>n3) {
			System.out.println(n1+"is greatest no");
		}
		else if(n2>n1&&n2>n3) {
			System.out.println(n2+"is greatest no");
		}
		else {
			System.out.println(n3+"is greatest no");
		}


	}

}
