package com.oops.string;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		int l=str.length();
		System.out.println("Enter character to be removed:");
		char c=sc.nextLine().charAt(0);
		int index=str.indexOf(c);
		String result = str.substring(0, index) + str.substring(index+1);
		System.out.println("string after removing character:"+result);

	}

}
