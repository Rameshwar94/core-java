package com.oops.relationships;

public class Discount extends Custumer {
	int finalBill,discount;
	
	public Discount() {
		super();
		
	}
	public Discount(int id,String name,MyDate dob,String prodName, int price,int quantity) {
		super();
		this.prodName=prodName;
		this.price=price;
		this.quantity=quantity;
	}
	public void calDiscount() {
		if(billAmount>=20000) {
			discount=(billAmount*15)/100;
		}
		else if(billAmount>=15000&&billAmount<=20000) {
			discount=(billAmount*10)/100;
		}
		else if(billAmount>=10000&&billAmount<=150000) {
			discount=(billAmount*7)/100;
		}
		else {
			discount=0;
			System.out.println("No discount");
		}
		finalBill=billAmount-discount;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Discount:"+discount);
		System.out.println("Final Bill:"+finalBill);
	}
}
