package com.basic;

import java.util.Scanner;
//problem statement is in multithraeding theory file
public class AvgOfArrayElements {
	static int sum=0;static int avg;
public static float avgArray(int[] a,int size) {
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		
	}
	return avg=sum/size;
}

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0||n>20) {
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
		float avg1=avgArray(a, n);
		
		System.out.println(String.format("%.2f", avg1));
	}

}
