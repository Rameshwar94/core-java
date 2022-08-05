package com.basic.array;

import java.util.Scanner;

public class AsceDesce {

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
			for(int m=1;m<=4;m++)	{	
				for(int j=0;j<=4;j++) {
					if(a[j]>=a[(m)]) {
						temp=a[m];
						a[m]=a[j];
						a[j]=temp;
						
					}
				}
			}
			
			for(int p=6;p<a.length;p++)	{	
				for(int r=5;r<a.length;r++) {
					if(a[r]<=a[(p)]) {
						temp=a[p];
						a[p]=a[r];
						a[r]=temp;
						
					}
					
					
				}
			}
		for(int k=0;k<a.length;k++) {
System.out.println(a[k]);
		}
	}

}
