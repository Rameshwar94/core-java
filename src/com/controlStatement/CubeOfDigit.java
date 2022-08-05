package com.controlStatement;

import java.util.Scanner;

public class CubeOfDigit {

	public static void main(String[] args) {
		System.out.println("Enter series. length:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n) {
			System.out.println(i*i*i);
			i++;
		}

	}

}
