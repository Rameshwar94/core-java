package com.controlStatement;

import java.util.Scanner;

public class OddNoSeries {

	public static void main(String[] args) {
		System.out.println("Enter series. length:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<n) {
			if(i%2!=0) {
				System.out.print(" "+i);
				
			}
			i++;
		}

	}

}
