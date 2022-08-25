package com.multithreding;

public class PriorityThreadEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThreadEx t1=new PriorityThreadEx();
		PriorityThreadEx t2=new PriorityThreadEx();
		PriorityThreadEx t3=new PriorityThreadEx();
		t1.setName("thread1");
		t1.setName("thread2");
		t3.setName("thread3");
		t1.setPriority(MIN_PRIORITY);//you can set priority but there is no guarantee that task scheduler will follow that
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name:"+getName()+" Thread Priority:"+getPriority());
	}

}
