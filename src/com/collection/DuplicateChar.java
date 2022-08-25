package com.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//find out the duplicate letters in String
public class DuplicateChar {

	public static void main(String[] args) {
		char d = 0;
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		Set set=new HashSet();
		for(char c:ch) {
		if(!set.add(c))
			System.out.println("duplicate char:"+c);
		}
		for(char c:ch) {
			
			for(int i=str.indexOf(c)+1;i<ch.length;i++) {
				
				if(ch[i]==c) {
					if(c!='0') {
				System.out.println("\nduplicate char:"+c);
					}
					ch[i]='0';
				}
				
				
			}
			
		}
	}

}
