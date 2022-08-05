package com.basic.array;

import java.util.Scanner;

public class ArrayMdUserInput {

	public static void main(String[] args) {
		System.out.println("Enter No of rows of array:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("Enter No of colums of array:");
		int clm=sc.nextInt();
		int a[][] =new int[row][clm];
		System.out.println("enter array elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<clm;j++) {
			a[i][j]=sc.nextInt();
			}
		}
for(int i=0;i<row;i++) {     //row
			
			for(int j=0;j<clm;j++) {  //clm
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
