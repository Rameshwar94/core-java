package com.oops.Abstraction;

public abstract class Bike {
	Bike(){
		System.out.println("Constructor in abstract class");
	}
	public abstract void run() ;
	public void display() {
		System.out.println("Non abstract method");
	}

}
