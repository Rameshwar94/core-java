package com.oops;

import java.util.Scanner;
//problem statement is in exception theory file
public class FindMileage {
	static int m;
	public static int findMileage(int cc) {
		if(cc>=100&&cc<=125) {
			m=75;
		}
		else if(cc>=126 && cc<=135) {
			m=70;
		}
		else if(cc<=136&&cc<=150) {
			m=60;
		}
		else if(cc<=151&&cc<=200) {
			m=50;
		}
		else {
			m=35;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cubic capcity of Bike:");
		int cc=sc.nextInt();
		if(cc>220) {
			System.out.println("Number too large");
		}
		else if(cc<100) {
			System.out.println("Number too small");
		}
		else {
			System.out.println("Mileage:"+findMileage(cc));
		}

	}

}
