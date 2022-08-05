package com.basic.array;

import java.util.Scanner;

public class ArrayElement {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
