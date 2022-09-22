package com.designpatterns;

import java.util.Scanner;

interface Food{
	public String prepareFood();
	public double foodPrice();
}
class VegFood implements Food{

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "food";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 50.0;
	}
	
}

abstract class FoodDecorator implements Food{
	private Food newFood;

	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}

	
	
}

class NonVegFood extends FoodDecorator{

	public NonVegFood(Food newFood) {
		super(newFood);
		
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+"Roasted Chicken";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+150;
	}
	
}
class ChinieseFood extends FoodDecorator{

	public ChinieseFood(Food newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood()+"fried Rice";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+100;
	}
	
}

public class DecoratorEx {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("------------food Menu-------------");
			System.out.println("Enter your choice");
			System.out.println("\n1.veg food \n2.non veg food \n3.chinies food \n4.exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				VegFood vegFood=new VegFood();
			System.out.println(vegFood.prepareFood());
			System.out.println(vegFood.foodPrice());
			break;
			
			case 2:
				Food f1=new NonVegFood(new VegFood());
				System.out.println(f1.prepareFood());
				System.out.println(f1.foodPrice());
				break;
			case 3:
				Food f2=new ChinieseFood(new VegFood());
				System.out.println(f2.prepareFood());
				System.out.println(f2.foodPrice());
				break;
			}
			
		}while(choice!=4);
		

	}

}
