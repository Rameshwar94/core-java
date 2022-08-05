package com.oops;

public class Student {
	int id;
	String name;
	int m1,m2,m3;
	int p;
	
	public Student() {
		id=1234;
		name="Premala";
		m1=60;
		m2=70;
		m3=80;
	}
	public Student(int id,String name,int m1,int m2,int m3) {
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	public void percentage() {
		int a=(m1+m2+m3);
		p=(a*100)/300;
		System.out.println("Percentage:"+p);
	}
public static void main(String[] args){
	Student s=new Student();
	s.percentage();
	Student s1=new Student(1111,"Siddhi",60,65,64);
	s1.percentage();
}
}
