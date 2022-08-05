package com.controlStatement;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter digits from 1 to 7:");
		int d=sc.nextInt();
		
		switch(d) {
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thirsday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("saturday");break;
		case 7:System.out.println("sunday");break;
		default:System.out.println("invalid choice");
		}
		System.out.println("Do you want to continue(y/n):");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
}
}