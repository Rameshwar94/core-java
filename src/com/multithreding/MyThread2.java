package com.multithreding;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Executing thread;"+Thread.currentThread().getName());
		}
	}
public static void main(String[] args) {
	MyThread2 myThread2=new MyThread2();
	Thread thread1=new Thread(myThread2);
	thread1.setName("thread1");
	thread1.start();
	Thread thread2=new Thread(myThread2);
	thread2.setName("thread2");
	thread2.start();
}
}
