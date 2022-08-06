package com.oops.Abstraction;

public class StudentA extends Marks {
	private int m1;
	private int m2;
	private int m3;

	StudentA(int m1,int m2,int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	@Override
	public int getPercetage() {
		// TODO Auto-generated method stub
		int result=(m1+m2+m3)/3;
		return result;
	}

}
