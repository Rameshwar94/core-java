package com.controlStatement;

import java.util.Scanner;

public class CallCharges {

	public static void main(String[] args) {
		System.out.println("Enter no of calls:");
		Scanner sc=new Scanner(System.in );
		int c=sc.nextInt();
		if(c<200) {
			int cc=c;
			System.out.println("charge for "+c+" calls is:"+cc+" Rupees");
		}
		else {
			int cc=3*c;
			System.out.println("charge for "+c+" calls is:"+cc+" Rupees");
		}
	}

}
