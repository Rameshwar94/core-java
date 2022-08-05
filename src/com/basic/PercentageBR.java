package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PercentageBR {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Marks of 3 sub out of 100:");
		int sub1=Integer.parseInt(br.readLine());
		int sub2=Integer.parseInt(br.readLine());
		int sub3=Integer.parseInt(br.readLine());
		int x=sub1+sub2+sub3;
		System.out.println("Total Marks Out of 300 :"+x);
		int p=(x*100)/300;
		System.out.println("Percentage:"+p+"%");


	}

}
