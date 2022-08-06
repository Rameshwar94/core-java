package com.oops.string;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++) {
			count++;
		}
		System.out.println(count+"   words are present in a string");

	}

}
