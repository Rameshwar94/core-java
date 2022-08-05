package com.oops;

import java.util.Scanner;

public class Employee {
	String empName;
	int empCode,basicSalary;
	int allowance,grossSalary;
	int tax,netSalary;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		empName=sc.nextLine();
		System.out.println("Enter Employee code:");
		empCode=sc.nextInt();
		System.out.println("Enter Employee Basic Salary:");
		basicSalary=sc.nextInt();
	}
	public void allow() {
		 allowance=(55*basicSalary)/100;
	}
	public void gross() {
		grossSalary=basicSalary+allowance;
	}
	public void tax() {
		tax=(12*grossSalary)/100;
	}
	public void net() {
		netSalary=grossSalary-tax;
		
	}
	public void display() {
		System.out.println("Employee code:"+empCode);
		System.out.println("Employee Name:"+empName);
		System.out.println("Basic Salary:"+basicSalary);
		System.out.println("Tax:"+tax);
		System.out.println("Net Salary:"+netSalary);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.accept();
		e.allow();
		e.gross();
		e.tax();
		e.net();
		e.display();

	}

}
