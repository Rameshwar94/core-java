package com.basic.array;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int countE=0;
		int countO=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				countE++;
				
			}
			
			else {
			
				countO++;
			}
			
		}
		System.out.println("Even Elements:"+countE);
		System.out.println("Odd elements:"+countO);

	}

}
