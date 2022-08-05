package com.controlStatement;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Marks of 3 sub out of 100:");
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int x=sub1+sub2+sub3;
		System.out.println("Total marks of 3 subjects are "+x);
		int p=(x*100)/300;
		System.out.println("Percentage:"+p+"%");
		
		if(p<35||sub1<35||sub2<35||sub3<35) {
			System.out.println("failed");
	}
		else if(p>=75) {
			
			System.out.println("passed with distinction");
			}
		else if(p>=65&&p<75) {
			System.out.println("passed with first class");
		}
		else if(p>35&&p<=45) {
			System.out.println("passed");
		}
		}

}
