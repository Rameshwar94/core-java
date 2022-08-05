package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Breader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 no.s:");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		System.out.println("Result:"+(a+b));
	}

}
