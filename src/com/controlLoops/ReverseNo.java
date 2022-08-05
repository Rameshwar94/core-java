package com.controlLoops;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		System.out.println("Enter No:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		while(n>0) {
		int	d=n%10;
			sum=d+(sum*10);
			n=n/10;
		}
		System.out.println("Reversed no:"+sum);
	}

}
