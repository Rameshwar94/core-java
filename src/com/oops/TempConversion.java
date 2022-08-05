package com.oops;

import java.util.Scanner;

public class TempConversion {
	
	public float convertToCentigrade(int f) {
		if(f<0) {
			return -1;
		}
		else {
			float c;
			c = ((f-32)/9)*5;
			return c;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit:");
		int tf=sc.nextInt();
		TempConversion tc=new TempConversion();
		float t=tc.convertToCentigrade(tf);
		if(t==-1) {
			System.out.println("Invalid input");
		}
		else {
			
			System.out.println("temp in centigrate:"+String.format("%.2f",t));
		}

	}

}
