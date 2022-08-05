package com.oops.relationships;

public class Student extends Person {
float m1,m2,m3,total,percentage;
	public Student() {
		super();
		m1=45;
		m2=56;
		m3=56;
	}
	public Student(int id,String name,MyDate dob,float m1,float m2,float m3) {
		super(id,name,dob);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
	}
	public void calculate() {
		total=m1+m2+m3;
		percentage=total/3;
	}
	@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
			System.out.println("Total:"+total);
			System.out.println("Percentage:"+percentage);
		}



}
