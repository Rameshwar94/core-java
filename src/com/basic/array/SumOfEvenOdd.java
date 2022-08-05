package com.basic.array;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sumE=0;
		int sumO=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sumE=sumE+a[i];
				
			}
			
			else {
			
				sumO=sumO+a[i];
			}
			
		}
		System.out.println("Sum of even elements:"+sumE);
		System.out.println("Sum of odd elements:"+sumO);

	}

}
