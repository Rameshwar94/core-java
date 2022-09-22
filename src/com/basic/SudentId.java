package com.basic;

import java.util.Scanner;
//problem statement is in java8features theory file
public class SudentId {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
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
		clearedStage1(a,n);
	}
      static int cleared[]=new int[10];
      static int j;
	public static void clearedStage1(int[] a, int n) {
		for(int i=0;i<a.length;i=i+3) { //Incrementing array index by 3 because id is saved at index multiple of 3
			
				if(a[i+1]>=70&&a[i+2]>=70) {//after id next 2 indices we are storing sub marks
					cleared[j]=a[i];
					j++;
				}
			
		}
		for(int k=0;k<j;k++) {
			System.out.println(cleared[k]);
		}
	}

}
