package com.basic.array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of array elements is:"+sum);

	}

}
