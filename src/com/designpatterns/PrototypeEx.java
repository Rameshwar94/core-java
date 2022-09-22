package com.designpatterns;

import java.util.Scanner;

interface Prototype{
	public Prototype getClone();
}
class Employee implements Prototype{
	private int id;
	private String empName,address;
	private double salary;
	public Employee(int id, String empName, String address, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + ", salary=" + salary + "]";
	}
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(id, empName, address, salary);
	}
	
}

public class PrototypeEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		
		sc.nextLine();//after int it take enter stroke as a string to avoid this use one nextLine();
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Address:");
		String add=sc.nextLine();
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		Employee emp=new Employee(id, name, add, salary);
		System.out.println(emp);
		Employee emp2=(Employee) emp.getClone();
		System.out.println(emp2);
		

	}

}
