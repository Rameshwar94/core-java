package com.basic;

import java.util.Scanner;
//problem Statement is in mysql theory file
public class IsDifference4 {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Array Size");
			System.exit(0);
		}
		int a[] =new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			if(a[i]<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
           
		}
		for(int j=0;j<a.length-1;j++) {
			int d=a[j]-a[j+1];
			if(d>=4||d<=-4) {
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
System.out.println(flag);
	}

}
