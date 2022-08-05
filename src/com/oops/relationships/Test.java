package com.oops.relationships;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		System.out.println();
		Person p1=new Person(101,"Siddhi",new MyDate(16, 07, 2020));
		p1.display();
		
		System.out.println();
		Employee e=new Employee();
		e.display();
		System.out.println();
		Employee e1=new Employee(222,"XYZ",new MyDate(12,12,1998),new Address("room no:1234","pqr street","pandharpur",413304,"India"));
		e1.display();
		System.out.println();
		Student s=new Student();
		s.calculate();
		s.display();
		System.out.println();
		Student s1=new Student(555,"ram",new MyDate(21,11,1987),57,87,90);
		s1.calculate();
		s1.display();
		
		System.out.println();
		Employee1 es=new Employee1();
		es.calSalary();
		es.display();
		System.out.println();
		Employee1 es1=new Employee1(555,"ram",new MyDate(21,11,1987),30,2000);
		es1.calSalary();
		es1.display();
		
		System.out.println();
		Grade g=new Grade();
		g.calculate();
		g.calGrade();
		g.display();
		System.out.println();
		Grade g1=new Grade(555,"ram",new MyDate(21,11,1987),57,87,90);
		g1.calculate();
		g1.calGrade();
		g1.display();
		
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sale:");
		int n=sc.nextInt();
		SalesPerson sp=new SalesPerson();	
		sp.calSalary();
		sp.calCommission();
		sp.display();
		System.out.println();
		SalesPerson sp1=new SalesPerson(555,"ram",new MyDate(21,11,1987),30,2000,n);
		sp1.calSalary();
		sp1.calCommission();
		sp1.display();
	}

}
