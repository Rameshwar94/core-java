package com.basic.array;

import java.util.Scanner;

public class FrequencyOfNo {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int cp = 0,cn = 0,co = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				cp++;
			}
			else if(a[i]<0) {
			cn++;	
			}
			else {
				co++;
			}
		}
		System.out.println("positive:"+cp);
		System.out.println("Negative:"+cn);
		System.out.println("Zeros:"+co);



	}

}
