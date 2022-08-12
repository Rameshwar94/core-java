package com.oops.Abstraction;

public abstract class AbstractClass {
	public AbstractClass() {
		// TODO Auto-generated constructor stub
		System.out.println("This is constructor of Abstract class");

	}

	abstract void a_method();

	public void b_method() {
		System.out.println("This is normal method of abstract class");
	}
     public static void main(String[] args) {
		
		SubClass s=new SubClass();
		s.a_method();
		s.b_method();
	}
}

 class SubClass extends AbstractClass {

	@Override
	public void a_method() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method");
	}

}
