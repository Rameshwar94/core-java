package com.java8features;

@FunctionalInterface
interface SquareInt{
	int square(int n);
}

@FunctionalInterface
interface Circle{
	float circle(float r);
}
@FunctionalInterface
interface Simple{
	float simpleInterest(float p,float n, float r);
}

@FunctionalInterface
interface Percentage{
	 double percentage(double m1 ,double m2, double m3);
}

public class Square {

	public static void main(String[] args) {
		SquareInt s=n->n*n;
		System.out.println(s.square(5));
		Circle c=r->{
			return 3.14f*r*r;
		};
		System.out.println(c.circle(5));
		
		Simple si=(p,n,r)->{
			return (p*n*r)/100;
		};
		System.out.println(si.simpleInterest(10000, 3, 7));

		Percentage p=(m1,m2,m3)->{
			return (m1+m2+m3)/3;
		};
		System.out.println(p.percentage(67, 64, 65));
	}

}
