package com.multithreding;

public class InterThreadComm {

	public static void main(String[] args) {
		Customer customer =new  Customer();
		new Thread("premala"){
			public void run() {customer.withDraw(15000);};
		}.start();
		
		new Thread("siddhi") {
			public void run() {customer.deposit(10000);};
		}.start();

	}

}
class Customer{
	private int amount=10000;
	
	synchronized void withDraw(int amount) {
		System.out.println("going to withdraw Rs."+amount);
		if(this.amount<amount) {
			System.out.println("less blance waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("withdrw completes. Available balance:"+this.amount);
	}
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit Rs."+amount);
		this.amount+=amount;
		System.out.println("Deposit completes. Balance:"+this.amount);
		notify();
		
	}
}