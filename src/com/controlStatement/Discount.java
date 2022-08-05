package com.controlStatement;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
			System.out.println("Enter purchase amount:");
			Scanner sc=new Scanner(System.in);
			int pa=sc.nextInt();
			if(pa>=10000) {
				int d=(10*pa)/100;
				int ad=pa-d;
				System.out.println(d+" Rupees discont is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is:"+ad+"Rupees");
			}
			else {
				int d=(2*pa)/100;
				int ad=pa-d;
				System.out.println(d+" Rupees discont is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" Rupees");
				
			}
	}

}
