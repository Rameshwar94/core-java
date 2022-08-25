package com.multithreding;

public class JoinMethodEx extends Thread {

	public static void main(String[] args) {
		JoinMethodEx t1=new JoinMethodEx();
		JoinMethodEx t2=new JoinMethodEx();
		JoinMethodEx t3=new JoinMethodEx();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();

	}
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
}
