package com.basic.array;

import java.util.Scanner;


public class ProductOf1st3rdLargestNo {
	public static int findFirstLargest(int a[],int n) {
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
		int k=a[a.length-3]*(a[a.length-1]);
		return k;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Array Size");
		}
		int array[] =new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<array.length;i++) {
			
			array[i]=sc.nextInt();
			if(array[i]<0) {
				System.out.println("Invalid input");
				System.exit(0);
				}
			
		}
     System.out.println("Product:"+findFirstLargest(array,n));
		}

}
