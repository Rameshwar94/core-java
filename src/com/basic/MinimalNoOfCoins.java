package com.basic;

import java.util.Scanner;

public class MinimalNoOfCoins {

	public static void main(String[] args) {
		System.out.println("Enter fee:");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		if(amt<0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		int c1,c2,c3,c4,c5,c6;

		c1=amt/500;
		amt=amt-(500*c1);
		c2=amt/100;
		amt=amt-(100*c2);
		c3=amt/50;
		amt=amt-(50*c3);
		c4=amt/10;
		amt=amt-(10*c4);
		c5=amt/5;
		amt=amt-(5*c5);
		c6=amt/1;
		amt=amt-(c6*c6);
		System.out.println("Minimal no of coins Required:"+(c1+c2+c3+c4+c5+c6));
	}

}
