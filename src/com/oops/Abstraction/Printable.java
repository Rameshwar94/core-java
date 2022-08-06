package com.oops.Abstraction;

public interface Printable {
	double PI=3.14;//public static final
	void calculate();//public abstract
	static int cube(int a) {
		return a*a*a;
	}
	  default void square(int x) {
		System.out.println("square:"+(x*x));
	}
}
