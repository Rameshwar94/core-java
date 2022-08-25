package com.basic;
//problem stmt is in multithreading theory file
import java.util.Scanner;

public class SecondSmallestDivisor {

	public static int count=0;
	public static int secondSmallestDiv;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		int ssd=secondSmallest(n);
		if(ssd==-1) {
			System.out.println("invalid input");
		}
		else {
			System.out.println(ssd);
		}

	}

	public static int secondSmallest(int n) {
		if(n<0||n>32767) {
			System.out.println("invalid input");
		}
		else {
			for(int i=1;i<(n/2);i++) {
			if(n%i==0) {
				count++;
				if(count==2) {
					secondSmallestDiv= i;
				}
			}
		}
		if(count==0||count==1) {
			secondSmallestDiv=-1;
		}	
		}
		return secondSmallestDiv;
	}

}
