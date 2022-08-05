package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaBR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double pi=3.14;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Radius:");
		int r=Integer.parseInt(br.readLine());
		System.out.println("Area of Circle:"+(pi*r*r));
		System.out.println("Enter length and width:");
		int l=Integer.parseInt(br.readLine());
		int w=Integer.parseInt(br.readLine());
		System.out.println("Area of Rectangle:"+(l*w));
		System.out.println("Enter Height and Base:");
		int h=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		double t=(h*b)/2;
		System.out.println("Area of triangle:"+t);
	}

}
