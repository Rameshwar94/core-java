package com.oops.Abstraction;

public class Honda extends Bike {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.display();

	}

	@Override
	public void run() {
		System.out.println("Running Safely");
		
	}

}
