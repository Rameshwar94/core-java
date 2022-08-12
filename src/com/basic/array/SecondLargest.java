package com.basic.array;

import java.util.Scanner;
//to terminate the program we can use system.exit0
public class SecondLargest {
	
	public int secondLargest(int[]a,int size) {
		
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
		return a[a.length-2];
		
	}

	public static void main(String[] args) {
		SecondLargest s=new SecondLargest();
		int flag=0;
		System.out.println("Enter size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Array Size");
		}
		
		int array[] =new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<array.length;i++) {
			
			array[i]=sc.nextInt();
			if(array[i]<0) {
				System.out.println("Invalid input");
				flag=1;
				break;
				
			}
			
		}
		if(flag==0) {
		int sl=s.secondLargest(array,n);
		System.out.println("second largest no:"+sl);
		}
		
	}
		
		
	}


