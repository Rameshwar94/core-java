package com.multithreding;

public class AccountDanger implements Runnable {
	private Account acct=new Account();

	public static void main(String[] args) {
		AccountDanger danger=new AccountDanger();
		Thread t1=new Thread(danger);
		Thread t2=new Thread(danger);
		t1.setName("premala");
		t2.setName("Ram");
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			makeWithdraw(1000);
		}
		
	}

	private synchronized void makeWithdraw(int amount) {//synchronized means at a time only one thread will enter a method and lock it 
		//after execution it will release lock and then another thread can enter a method
		// TODO Auto-generated method stub
		if(acct.getBalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(500);//to see the output
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acct.withDraw(amount);
			System.out.println(Thread.currentThread().getName()+" complete withdraw.available balance:"+acct.getBalance());
		}
		else {
			System.out.println("Not enough balance in account for "+Thread.currentThread().getName()+" Balace:"+acct.getBalance());
		}
	}

}
