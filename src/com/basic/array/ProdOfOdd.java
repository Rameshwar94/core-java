package com.basic.array;

import java.util.Scanner;

public class ProdOfOdd {

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
		int prd=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				sum=sum+a[i];
				
			}
			
			else {
			
				prd=prd*a[i];
			}
			
		}
		System.out.println("Sum of even elements:"+sum);
		System.out.println("product of odd elements:"+prd);

	}

}
