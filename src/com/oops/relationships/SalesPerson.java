package com.oops.relationships;

public class SalesPerson extends Employee1{
	int sale;
	int grossSalary;
	int commission;
	
	public SalesPerson() {
		super();
		sale=95;
		
	}
	public SalesPerson(int id,String name,MyDate dob,int workingDays,int perDay,int sale) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.workingDays=workingDays;
		this.perDay=perDay;
		this.sale=sale;
	}
	public void calCommission() {
		if(sale>=95) {
			commission=(20*salary)/100;
		}
		else if(sale>=90&& sale<=95) {
			commission=(15*salary)/100;
		}
		else if(sale>=80&&sale<=90) {
			commission=(10*salary)/100;
		
	}
		else if(sale>=75&&sale<=80) {
		commission=(5*salary)/100;
		}
		else {System.out.println("no Commission");
		commission=0;
			}
		}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("commission:"+commission);
		System.out.println("GrossSalary:"+(salary+commission));
	}

}
