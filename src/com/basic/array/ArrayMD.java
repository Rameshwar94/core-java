package com.basic.array;

public class ArrayMD {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		for(int i=0;i<2;i++) {     //row
			
			for(int j=0;j<2;j++) {  //clm
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
