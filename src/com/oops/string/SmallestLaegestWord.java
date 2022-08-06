package com.oops.string;

import java.util.Scanner;

public class SmallestLaegestWord {
	static String small;
	static String large;
	String temp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		for(int i=0;i<word.length-1;i++) {
			for(int j=1;j<word.length-1;j++) {
				if(word[i].length()>word[j].length()) {
					small=word[j];
					large=word[i];
				}
			}
		}
		System.out.println("small word:"+small);
		System.out.println("large word:"+large);
	}

}
 