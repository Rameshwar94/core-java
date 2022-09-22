package com.designpatterns;


interface Shape{
	void draw();//public abstract by default
}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing Rectangle");
	}
	
}
class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square");
	}
	
}
class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		
		}
		else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
		
	}
}

public class FactoryPatternEx {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		shapeFactory.getShape("Rectangle").draw();
		shapeFactory.getShape("Square").draw();
	}
	
	
	
}
