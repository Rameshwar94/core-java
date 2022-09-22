package com.practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		char[] c=new char[2];
		Integer var1=new Integer(2);
		Integer var2=new Integer(2);
		
		if(var1==var2)
			System.out.println("true");
		else
			System.out.println("false");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
	}

}
