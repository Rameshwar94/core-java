package com.basic;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Marks of 3 sub out of 100:");
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int x=sub1+sub2+sub3;
		int p=(x*100)/300;
		System.out.println("Percentage:"+p+"%");



	}

}
