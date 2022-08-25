package com.basic.array;
//problrm stmt is in multithreading theory file
import java.util.Scanner;

public class EndsWith3 {

	public static void main(String[] args) {
		int count=0;
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
		for(int i=0;i<a.length;i++) {
			int d=a[i];
			int m=d%10;
			if(m==3) {
				count++;
			}
		}
		System.out.println(count);
	}

}
