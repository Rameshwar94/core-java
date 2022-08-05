package com.oops.relationships;

public class Grade extends Student {
	float p;
	String grd;

	public Grade() {
		super();
	 p=super.percentage;
	 grd="pass";
	 
	}
	
	public Grade(int id,String name,MyDate dob,float m1,float m2,float m3) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		//this.p=p;
		//this.grd=grd;
	}
	public void calGrade() {
		if(p>75) {
			grd="Distinction";
		}
		else if(p<75&&p>65) {
			grd="First class";
		}
		else {
			grd="pass";
		}
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Grade:"+grd);
	}
}
