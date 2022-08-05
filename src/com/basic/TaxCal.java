package com.basic;

import java.util.Scanner;

public class TaxCal {

	public static void main(String[] args) {
		System.out.println("Enter salary:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		float taxAmount=(12*s)/100;
		System.out.println("Tax Amout on salary of "+s+"is:"+taxAmount);
		

	}

}
