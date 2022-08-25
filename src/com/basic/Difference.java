package com.basic;
//problem statement is in multithreadingTheory File
import java.util.Scanner;

public class Difference {
	static int diff=0;
	private static int secondMaxMinDiff(int[] a, int n) {
		int temp;
		for(int m=1;m<a.length;m++)	{	
		for(int j=0;j<a.length;j++) {
			if(a[j]>=a[(m)]) {
				temp=a[m];
				a[m]=a[j];
				a[j]=temp;
				
			}
			
			
		}
		}
		 diff=a[a.length-2]-a[1];
		 return diff;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Array Size");
			System.exit(0);
		}
		int a[] =new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			if(a[i]<0) {
				System.out.println("Invalid input");
				System.exit(0);
			}
           
		}
		System.out.println(secondMaxMinDiff(a,n));
	}

	

}
