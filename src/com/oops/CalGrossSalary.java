package com.oops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalGrossSalary {
	 static int rentAllowance,specialAllow;static float grossSalary;
	public static float calculateGross(int s,int d) {
		rentAllowance=(50*s)/100;
		specialAllow=(75*s)/100;
		if(d==31) {
		grossSalary= s+rentAllowance+specialAllow+500;
		}
		else {
			grossSalary= s+rentAllowance+specialAllow;
		}
		return grossSalary;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		int basicSalary=sc.nextInt();
		if(basicSalary>10000||basicSalary<0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter no of days worked:");
		int days=sc.nextInt();
		if(days>31||days<=0) {
			System.out.println("Invalid Input");
			System.exit(0);	
		}
		float gs=calculateGross(basicSalary, days);
		System.out.println(String.format("%.2f",gs)); 
	}

}
