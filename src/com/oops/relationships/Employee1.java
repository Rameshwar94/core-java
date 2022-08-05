package com.oops.relationships;

public class Employee1 extends Person {
	int salary,workingDays,perDay;
	
	public Employee1() {
		super();
		workingDays=30;
		perDay=1000;
	}
	public Employee1(int id,String name,MyDate dob,int workingDays,int perDay) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.workingDays=workingDays;
		this.perDay=perDay;
	}
	public void calSalary() {
		salary=workingDays*perDay;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary:"+salary);
	} 
		
	
	

}
