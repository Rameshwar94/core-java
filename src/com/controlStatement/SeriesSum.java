package com.controlStatement;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		System.out.println("Enter series. length:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i;
		for( i=1;i<=n;i++) {
			System.out.print(i+"/"+(i));
			if(i<n) {
				System.out.print(" + ");
			}
			
			sum=sum+(i/i);
			
		}
     System.out.print("="+sum);
	}

}
