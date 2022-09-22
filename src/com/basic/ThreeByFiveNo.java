package com.basic;

import java.util.Scanner;
//problrm Statement is in java8features theory
public class ThreeByFiveNo {
	public static int flag;
	private static int prod=1;
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=divisibleByThreeFive(n);
		if(a==1) {
			System.out.println("yes");
		}
		else if(a==0){
			System.out.println("no");
		}
		else {
			System.out.println("invalid input");
		}
	}

	public static int divisibleByThreeFive(int n) {
		if(n<0) {
			flag=-1;
		}
		else {
		while(n>0) {
			int m=n%10;
			prod=prod*m;
			n=n/10;
		}
		
		if(prod%3==0||prod%5==0) {
			flag=1;
		}
		else {
			flag=0;
		}
		}
		return flag;
	}
	

}
