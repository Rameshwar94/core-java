package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIntrestBR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter P,r and t:");
		int p=Integer.parseInt(br.readLine());
		int r=Integer.parseInt(br.readLine());
		int t=Integer.parseInt(br.readLine());
	//	char c=br.readLine().charAt(0);
		int s=(p*r*t)/100;
		System.out.println("Simple Intrest:"+s);
	}

}
