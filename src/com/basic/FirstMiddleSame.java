package com.basic;

import java.util.Scanner;
//problem statement is in design pattern theory file
public class FirstMiddleSame {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Array Size");
			System.exit(0);
		}
		else if(n%2==0) {
			System.out.println("Size must be odd");
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
        	if(a[0]==a[a.length/2]) {
        		System.out.println("100");
        	}
        	else
        		System.out.println(a[0]);
    
	}

}
