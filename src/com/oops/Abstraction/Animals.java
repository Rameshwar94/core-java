package com.oops.Abstraction;

public abstract class Animals {
	public abstract void cats();
	public abstract void dogs();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats c=new Cats();
		Dogs d=new Dogs();
		c.cats();
		d.dogs();
	}

}
 class Cats extends Animals{

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		System.out.println("cats meow");
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 class Dogs extends Animals{
  @Override
	public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("dogs bark");
	}

@Override
public void cats() {
	// TODO Auto-generated method stub
	
}


	 
 }