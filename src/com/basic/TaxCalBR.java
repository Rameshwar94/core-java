package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxCalBR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter salary:");
		int s=Integer.parseInt(br.readLine());
		float taxAmount=(12*s)/100;
		System.out.println("Tax Amout on salary of "+s+"is:"+taxAmount);
		
	}

}
