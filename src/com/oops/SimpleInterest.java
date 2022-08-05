package com.oops;

public class SimpleInterest {
	double s;
	int p,t;
	int r;
	public SimpleInterest() {
		p=10000;
		r=8;
		t=3;
	}
	public SimpleInterest(int p,int r,int t) {
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public void calInterest() {
		s=(p*r*t)/100;
		System.out.println("Simple Interest:"+s);
	}

	public static void main(String[] args) {
		SimpleInterest si=new SimpleInterest();
		si.calInterest();
		SimpleInterest si1=new SimpleInterest(15000, 9, 10);
		si1.calInterest();
		

	}

}
