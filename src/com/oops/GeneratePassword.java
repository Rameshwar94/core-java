package com.oops;

import java.util.Scanner;

//problem statement is in oops file
public class GeneratePassword {
	static int sum=0;
	static int cp=0;
	public static int sumPrimeArray(int a[],int size) {
		for(int i=0;i<a.length;i++) {
			int count=0;
			int b=a[i];
			int c=b/2;
			for(int i1=2;i1<=c;i1++) {
				if(b%i1==0) {
					cp=1;; //final counter for no of prime no present in array
					count++;   //counter to check prime no
					
				}
			}
			if(count==0) {
				sum=sum+a[i];
				count--;
		}
		
			
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		
		System.out.println("Enter size of array :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int[] a=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]<0) {
				System.out.println("invalid input");
				System.exit(0);
			}
		}
		
		int password=sumPrimeArray(a,n);
		if(cp==1) {
			System.out.println("0");
		}	
		else
		System.out.println("password:"+password);
	}

}
