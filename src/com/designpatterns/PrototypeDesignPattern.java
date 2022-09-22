package com.designpatterns;

import java.util.Hashtable;

abstract class Shape1 implements Cloneable{
	private String id;
	String type;
	abstract public void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class Rectangle1 extends Shape1{
	
	public Rectangle1() {
		type="Rectangle";
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}
	
}
class Circle1 extends Shape1{
	public Circle1() {
		type="Circle";
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}
	
}
class Square1 extends Shape1{
	public Square1() {
		type="Square";
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square");
	}
	
}

class ShapeCache {
	private static Hashtable<String, Shape1> shapeMap=new Hashtable<String,Shape1>();
	
	public static Shape1 getShape(String shapeId) throws CloneNotSupportedException {
		Shape1 shape1=shapeMap.get(shapeId);
		return (Shape1) shape1.clone();
	}
	public static void addShape() {
		Circle1 circle1=new Circle1();
		circle1.setId("1");
		shapeMap.put(circle1.getId(), circle1);
		
		Rectangle1 rectangle1=new Rectangle1();
		rectangle1.setId("2");
		shapeMap.put(rectangle1.getId(), rectangle1);
		
		Square1 square1=new Square1();
		square1.setId("3");
		shapeMap.put(square1.getId(), square1);
	}
}
public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		ShapeCache.addShape();
		Shape1 clonedShape1=ShapeCache.getShape("1");
		System.out.println("Shape: "+clonedShape1.getType());
		
		Shape1 clonedShape2=ShapeCache.getShape("2");
		System.out.println("Shape: "+clonedShape2.getType());
		
		Shape1 clonedShape3=ShapeCache.getShape("3");
		System.out.println("Shape: "+clonedShape3.getType());
		
		

	}

}

















