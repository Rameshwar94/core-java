package com.oops.Abstraction;

public class BankC extends Bank {

	@Override
	public void getBalace() {
		// TODO Auto-generated method stub
		System.out.println("Deposited Amount: $200");
	}
public static void main(String[] args) {
	BankA a=new BankA();
	BankB b=new BankB();
	BankC c=new BankC();
	a.getBalace();
	b.getBalace();
	c.getBalace();
}
}
