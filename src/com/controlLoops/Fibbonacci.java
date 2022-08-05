package com.controlLoops;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.println("Enter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;++i) {
			System.out.println(num1+" ");
			int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
		}
		

	}

}
