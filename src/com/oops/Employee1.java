package com.oops;

public class Employee1 {
	int id,workingDays,perDay,salary;
	String name;
	public Employee1() {
		id=1234;
		name="Premala";
		workingDays=30;
		perDay=1000;
	}
	public Employee1(int id,String name,int workingDays,int perday) {
		this.id=id;
		this.name=name;
		this.workingDays=workingDays;
		this.perDay=perday;
	}
	public void salary() {
		salary=workingDays*perDay;
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.salary();
		Employee1 e1=new Employee1(1222,"PSN",28,2000);
		e1.salary();

	}

}
