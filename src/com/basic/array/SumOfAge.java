package com.basic.array;

import java.util.Scanner;
//que is in filehandling theory file
public class SumOfAge {
	static int sum=0;
	public static int newArraySum(int age[],int size) {
		for(int i=0;i<age.length;i++) {
			if(age[i]>18) {
				sum=sum+age[i];
			}
			
		}
		return sum;
	}

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
		System.out.println(newArraySum(a, n));
	}

}
