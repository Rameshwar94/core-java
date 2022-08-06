package com.oops.Abstraction;

public class InterfaceImplEx implements Printable,Showable {

	public static void main(String[] args) {
		InterfaceImplEx i=new InterfaceImplEx();
		i.show();
		i.calculate();
		i.square(4);
		System.out.println("cube:"+Printable.cube(8));
		

	}

	@Override
	public void show() {
		System.out.println("show() from showable interface");
		
	}

	@Override
	public void calculate() {
		System.out.println("calculate() from Printable Interface");
		float r=10f;
		System.out.println("Area:"+(PI*r*r));
		
	}

}
