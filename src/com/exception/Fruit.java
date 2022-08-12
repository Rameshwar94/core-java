package com.exception;

public class Fruit {
	
	public static void checkFood(String fruit)throws BadFoodException{
		if(fruit=="mango") {
			System.out.println("I like Mango");
		}
		else {
			throw new BadFoodException("fruit is bad");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkFood("Apple");
		} catch (BadFoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rest of code...");
	}

}
