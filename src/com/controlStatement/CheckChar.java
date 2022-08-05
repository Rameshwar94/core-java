package com.controlStatement;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter character:");
		char c=sc.next().charAt(0);
		
		
		switch(c) {
		
		case 'a': System.out.println("its vowel");
		break;
		case 'e':System.out.println("its vowel");
		break;
		case 'i':System.out.println("its vowel");
		break;
		case 'u':System.out.println("its vowel");
		break;
		case 'o':System.out.println("its vowel");
		break;
		default:System.out.println("its consonent");
		}
		System.out.println("do you want to continue(y/n):");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
