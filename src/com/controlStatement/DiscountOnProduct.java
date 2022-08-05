package com.controlStatement;

import java.util.Scanner;

public class DiscountOnProduct {

	public static void main(String[] args) {
      System.out.println("Product                       code");
      System.out.println("Computer Stationary             1");
      System.out.println("Fixed Disc                      2");
      System.out.println("Computers                       3");
      System.out.println("Enter your product code:");
      Scanner sc=new Scanner(System.in);
      int code=sc.nextInt();
           System.out.println("Enter order amount:");
      int pa=sc.nextInt();
     
      if(code==1) {
    	  if(pa>=500) {
    		  int d=(12*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  else if(pa>=300&&pa<=500) {
    		  int d=(8*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  else {
    		  int d=(2*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  
      }
      else if(code==2) {
    	  if(pa>=2000) {
    		  int d=(10*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  else if(pa>=1500&&pa<2000) {
    		  int d=(5*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  else {System.out.println("No discount");}
      }
      else if(code==3){
    	  if(pa>=5000) {
    		  int d=(10*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  else if(pa>=2500&&pa<5000) {
    		  int d=(5*pa)/100;
				int ad=pa-d;
				System.out.println(d+" $ discount is offered on the purchase amount of "+pa);
				System.out.println("Amount after Discount is: "+ad+" $");
    	  }
    	  else {System.out.println("no discount");}
      }
      else {System.out.println("invalid code");}
	}

}
