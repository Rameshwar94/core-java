package com.controlLoops;

import java.util.Scanner;
//instead of for loop math.power fun can be used
public class Dynamic {

	public static void main(String[] args) {
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		int k = 1;
		int count=0;
		int a=m;
		while(a>0) {
			int z=a%10;
			count++;
			a=a/10;
		}
		System.out.println(count);
		while(n>0) {
			int d=n%10;
			for(int i=1;i<=count;i++) {
				
				k=k*d;
				
			}
			System.out.println(k);
			sum=sum+k;
			k=1;
			n=n/10;
		}
		System.out.println(sum);
		if(m==sum) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}

	}

}
