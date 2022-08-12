package com.oops;

import java.util.Scanner;

import com.controlLoops.ReverseNo;
//problem statement is inside exceptionTheory file
public class GenerateCode {
	static int e=0;
	static int count=0;
	public static int generateCode(int n) {
		while(n>0) {
			int m=n%10;
			if(m%2==0) {
				e=m+(e*10);
				count++;
			}
			n=n/10;
		}
		
		return e;
	}

	public static void main(String[] args) {
		int c = 0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente no to generate coupen code:");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Number is too Small");
		}
		else if(n>32767) {
			System.out.println("Number is too Large");
		}
		else {
		 c=	generateCode(n);
		}
		int coupenCode=0;
		while(c>0) {
		int	d=c%10;
			coupenCode=d+(coupenCode*10);
			c=c/10;
		}
		if(count==0) {
			System.out.println("0");//if number do not have any even digit
		}
		else
		System.out.println("coupen code:"+coupenCode);
	}

}
