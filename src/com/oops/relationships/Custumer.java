package com.oops.relationships;

public class Custumer extends Person{
	String prodName;
	int quantity, price, billAmount;
	
	public Custumer() {
		super();
		prodName="cell phone";
		price=5000;
		quantity=4;
		
	}

	public Custumer(int id,String name,MyDate dob,String prodName, int price,int quantity) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
		
	}
	public void calBillAmount() {
		billAmount=price*quantity;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Bill Amount:"+billAmount);
	}
}
