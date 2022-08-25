package com.basic.array;
//problrm stmt is in multithreading theory file
import java.util.Scanner;

public class CalFee {
	static int feeAfterDiscount=0;
	static int d=0;
	public static int calculateFee(int f,int m) {
		if(m>90){
			d=(f*50)/100;
			feeAfterDiscount=f-d;
		}
		else if(m>=81&&m<=90) {
			d=(f*25)/100;
			feeAfterDiscount=f-d;
		}
		else if(m>=70&&m<=80) {
			d=(f*10)/100;
			feeAfterDiscount=f-d;
		}
		else {
			feeAfterDiscount=f;
		}
		return feeAfterDiscount;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee:");
		int fee=sc.nextInt();
		System.out.println("Enter Marks:");
		int mark=sc.nextInt();
		if(fee<0||mark<0) {
			System.out.println("invalid input");
		}
		else if(fee>32767) {
			System.out.println("invalid fee");
		}
		else if(mark>100) {
			System.out.println("invalid mark");
		}
		else {
			System.out.println(calculateFee(fee,mark));
		}
	}

}
