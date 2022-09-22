package com.practice;
class SuperClass{
	int a=10;

	public SuperClass(int i) {
		System.out.println(i);
	}
	
	public void superClass() {
		System.out.println("Superclass"+a);
	}
}
public class Upcasting extends SuperClass{
   public Upcasting(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

int a=20;
   int b=22;
 
   public void superClass() {
		System.out.println("Subclass"+a);
	}
   
	public static void main(String[] args) {
		SuperClass obj=new Upcasting(1);
	System.out.println(obj.a);
	System.out.println(obj instanceof SuperClass);
	
	}
 
 	
}
