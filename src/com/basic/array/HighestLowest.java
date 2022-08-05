package com.basic.array;

import java.util.Scanner;

public class HighestLowest {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
			for(int j=1;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
				}
		}
			System.out.println("Max no:"+max);
			System.out.println("Min no:"+min);
	}
}

