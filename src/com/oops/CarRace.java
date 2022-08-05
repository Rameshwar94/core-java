package com.oops;

import java.util.Scanner;

public class CarRace {
	
	public int productDigits(int km) {
		if(km<0||km>32767) {
			return -1;
		}
		else {
			int m;
			int prod=1;
			while(km>0) {
			m=km%10;
			prod=prod*m;
			km=km/10;
			}
			return prod;
			
		}
		
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter km you travelled:");
		int km=sc.nextInt();
		CarRace c=new CarRace();
	int amount	=c.productDigits(km);
	if(amount==-1) {
		System.out.println("Invalid Input");
	}
	else {
		System.out.println("Your win amount is:"+amount);
	}
	}

}
