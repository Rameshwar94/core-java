package com.oops.Abstraction;

public class StudentB extends Marks {
	private int m1;
	private int m2;
	private int m3;
	private int m4;

	StudentB(int m1,int m2,int m3,int m4){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	
	@Override
	public int getPercetage() {
		// TODO Auto-generated method stub
		int result=(m1+m2+m3+m4)/4;
		return result;
	}
public static void main(String[] args) {
		StudentA sa=new StudentA(60, 65, 70);
		StudentB sb=new StudentB(87, 86, 88,89);
		System.out.println("pecentage of studentA:"+sa.getPercetage());
		System.out.println("percentage of StudentB:"+sb.getPercetage());
		}

}
