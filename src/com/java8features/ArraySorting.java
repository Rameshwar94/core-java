package com.java8features;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int a[]= {12,2,34,45,23,13,1,89};
		System.out.println("Before Sorting");
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		Arrays.parallelSort(a);//sort complete array
		//Arrays.parallelSort(a,0,6);//sort only 0-5 indices elements
		System.out.println("\nAfter Sorting");
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

}
