package com.controlStatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OneBynSeries {

	public static void main(String[] args) {
		System.out.println("Enter series. length:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		double i;
		for( i=1;i<=n;i++) {
			System.out.print(1+"/"+(i));
			if(i<n) {
				System.out.print(" + ");
			}
			
			sum=sum+(1/i);
			
		}
       System.out.println(" = "+String.format("%.3f", sum));
}

}
