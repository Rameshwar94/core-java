package com.basic.array;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int temp;
			for(int m=1;m<a.length;m++)	{	
			for(int j=0;j<a.length;j++) {
				if(a[j]>=a[(m)]) {
					temp=a[m];
					a[m]=a[j];
					a[j]=temp;
					
				}
				
				
			}
			}
		for(int k=0;k<a.length;k++) {
System.out.println(a[k]);
		}
	}

}
