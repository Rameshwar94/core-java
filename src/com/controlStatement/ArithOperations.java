package com.controlStatement;

import java.util.Scanner;

public class ArithOperations {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter two no:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Ener Your choice:\n + for addition \n - for substraction \n * for multiplication \n / for Division");
		String operator=sc.next();
		switch(operator) {
		case "+":System.out.println("Addition :"+(a+b));
		break;
		case "-":System.out.println("Substraction: "+(a-b));
		break;
		case "*":System.out.println("multiplication: "+(a*b));
		break;
		case "/":System.out.println("Division"+(a/b));
		break;
		default:System.out.println("invalid choice");
		
		}
		System.out.println("Do you want to continue(y/n):");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		
	}

}
