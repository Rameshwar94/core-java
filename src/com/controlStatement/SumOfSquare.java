package com.controlStatement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter series. length:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+"/"+(i*i));
			if(i<n) {
				System.out.print(" + ");
			}
			
			sum=sum+(i/Math.pow(i, 2));
			
		}
       
        DecimalFormat df = new DecimalFormat("#.##");

          
            System.out.print(" = " + df.format(sum));    
           
	}

}
