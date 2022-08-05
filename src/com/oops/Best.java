package com.oops;

import java.util.Scanner;

public class Best {
	String custName,phoneNo;
	int nOfCalls;
	double tax,bill;
	double b;
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Custumer Name:");
		custName=sc.nextLine();
		System.out.println("Enter Phone No:");
		phoneNo=sc.nextLine();
		System.out.println("Enter no of Calls:");
		nOfCalls=sc.nextInt();
	}
	public void billing() {
		if(nOfCalls<=100) {
			System.out.println("Bill:Nill");
		}
		else if(nOfCalls>100&&nOfCalls<=300) {
			 b=0.80*nOfCalls;
			
		}
		else if(nOfCalls>300&&nOfCalls<=500) {
			 b=1.25*nOfCalls;
			
		}
		else {
			 b=2.50*nOfCalls;
			 
			
		}
		System.out.println("Bill:"+b);
		tax=(12*b)/100;
		System.out.println("Tax:"+tax);
		bill=b+tax;
		System.out.println("Final Bill:"+bill);
		
	}
	

	public static void main(String[] args) {
		Best bs=new Best();
		bs.accept();
		bs.billing();

	}

}
