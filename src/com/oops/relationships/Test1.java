package com.oops.relationships;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Quantity:");
		int q=sc.nextInt();
		Discount d=new Discount();
		d.calBillAmount();
		d.calDiscount();
		d.display();
		System.out.println();
		Discount d1=new Discount(121,"siddhi",new MyDate(16,07,2020),"mobile",5000,q);
		d1.calBillAmount();
		d1.calDiscount();
		d1.display();

	}

}
