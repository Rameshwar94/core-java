package com.oops;

import java.util.Scanner;

public class PrimeNo {
	public void prime(int a) {
	int count=0;
	int c=a/2;
	for(int i=2;i<=c;i++) {
		if(a%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println(a+"is a prime no");
	}
	else {
		System.out.println(a+"is not a prime no");
	}
	
	}

	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in);
		PrimeNo p=new PrimeNo();
		do {
		System.out.println("Enter No:");
		int n=sc.nextInt();
		p.prime(n);
		System.out.println("do you want to continue(y/n):");
		 c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');

	}

}
