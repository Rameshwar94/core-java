package com.controlLoops;

import java.util.Scanner;

public class DoAddWhile {

	public static void main(String[] args) {
		int a,b;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter nos:");
		
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Result:"+ (a+b));
		System.out.println("Do you want to continue(y/n):");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');

	}

}
