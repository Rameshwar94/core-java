package com.oops;

public class Rectangle {
	int l,b;
	
	public Rectangle() {
		l=12;
		b=8;
		
	}
	/*public Rectangle(int length,int breadth) {
		l=length;
		b=breadth;
				
	}*/
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public void area() {
		System.out.println("Area:"+(l*b));
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
		Rectangle r1=new Rectangle(4, 5);
		r1.area();

	}

}
