package com.designpatterns;

import java.util.Scanner;

interface MobileShop{
	public void modelNo();
	public void price();
	
}
 
class Iphone implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("Iphone");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.65000");
	}
	
}
class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Galaxy");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.45000");
	}
	
}
class BlackBerry implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("BlackBerry Z10");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.55000");
	}
	
}
class ShopKeeper{
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	
	public ShopKeeper() {
		iphone=new Iphone();
		samsung=new Samsung();
		blackberry=new BlackBerry();		
	}
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}
	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}
	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}
}
public class FacadeEx {

	public static void main(String[] args) {
		int choice;
		ShopKeeper shopkeeper=new ShopKeeper();
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Choice. press\n1.Iphone \n2.Samsung \n3.BlackBerry \n4.exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:shopkeeper.iphoneSale();
			break;
			case 2:shopkeeper.samsungSale();
			break;
			case 3:shopkeeper.blackberrySale();
			break;
			default:System.out.println("Invalid choice");
			}
		}while(choice!=4);

	}

}
