package com.controlStatement;

import java.util.Scanner;

public class TaxOnSalary {

	public static void main(String[] args) {
		System.out.println("Enter salary:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(s<25000) {
			float taxAmount=(10*s)/100;
			System.out.println("Tax Amout on salary of "+s+"is:"+taxAmount);
		}
		else {
			float taxAmount=(15*s)/100;
			System.out.println("Tax Amout on salary of "+s+"is:"+taxAmount);
		}
	}

}
