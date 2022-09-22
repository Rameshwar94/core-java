package com.practice;

import java.util.Scanner;

public class RestaurantMangement {

	public static void main(String[] args) {
		int[] selectedMenu = new int[10];
		int choice;
		int bill1 = 0, bill2 = 0, bill3 = 0;
		String vegMenu[] = { "1.Rice", "2.Roti", "3.PaneerMasala", "4.BrinjalMAsala", "5.nan" };
		String nonVeg[] = { "1.Fried Chiken", "2.chiken curry", "3.chiken Biryani", "4.fish" };
		String dessert[] = { "1.peda", "2.jalebi", "3.Gulab Jamun", "4.kheer" };
		int vegPrice[] = { 120, 20, 125, 120, 30 };
		int nonvegPrice[] = { 250, 125, 200, 300 };
		int dessertPrice[] = { 50, 40, 60, 80 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		System.out.println("Enter Mob No:");
		long mobNo = sc.nextLong();
		System.out.println("Choose Restaurant: \n1.Mac-D  \n2.KFC");
		System.out.println("press option number to select");
		int restau = sc.nextInt();
		sc.nextLine();
		
		if (restau == 1) {
			do {
				System.out.println("select menu type:  \n\t1.veg  \n\t2.non-veg  \n\t3.desert \n\t4.exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					bill1 = selectVegMenu(name, mobNo, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
							selectedMenu);
					break;
				case 2:
					bill2 = selectNonVegMenu(name, mobNo, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
							selectedMenu);
					break;
				case 3:
					bill3 = selectDessertMenu(name, mobNo, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
							selectedMenu);
					break;
				}

			} while (choice != 4);
			System.out.println("Final Bill of all menu types: " + (bill1 + bill2 + bill3));

		} else if (restau == 2) {
			do {
				System.out.println("select menu type:  \n1.veg  \n2.non-veg  \n3.desert \n4.exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					bill1 = selectVegMenu(name, mobNo, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
							selectedMenu);
					break;
				case 2:
					bill2 = selectNonVegMenu(name, mobNo, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
							selectedMenu);
					break;
				case 3:
					bill3 = selectDessertMenu(name, mobNo, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
							selectedMenu);
					break;
				}
			} while (choice != 4);
			System.out.println("Final Bill of all menu types: " + (bill1 + bill2 + bill3));
		} else
			System.out.println("invalid choice");

	}

	public static int selectVegMenu(String name, long mobNo, String[] vegMenu, String[] nonVeg, String[] dessert,
			int[] vegPrice, int[] nonvegPrice, int[] dessertPrice, int choice, int[] selectedMenu) {
		int bill = 0;
		System.out.println("---veg Menu----");
		for (int k = 0; k <= 3; k++)
			System.out.println(vegMenu[k] + " - " + vegPrice[k]);
		bill = selectMenu(vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice, selectedMenu);
		System.out.println("name:" + name);
		System.out.println("contact no:" + mobNo);
		printBill(bill, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, selectedMenu, choice);
		return bill;
	}
	
	public static int selectNonVegMenu(String name, long mobNo, String[] vegMenu, String[] nonVeg, String[] dessert,
			int[] vegPrice, int[] nonvegPrice, int[] dessertPrice, int choice, int[] selectedMenu) {
		System.out.println("---non veg menu---");
		int bill = 0;
		for (int ji = 0; ji <= 3; ji++)
			System.out.println(nonVeg[ji] + " - " + nonvegPrice[ji]);
		bill = selectMenu(vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice,
				selectedMenu);
		System.out.println("name:" + name);
		System.out.println("contact no:" + mobNo);
		printBill(bill, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, selectedMenu,
				choice);
		return bill;
	}

	public static int selectDessertMenu(String name, long mobNo, String[] vegMenu, String[] nonVeg, String[] dessert,
			int[] vegPrice, int[] nonvegPrice, int[] dessertPrice, int choice, int[] selectedMenu) {
		System.out.println("---Dessert Menu----");
		int bill = 0;
		for (int i1 = 0; i1 <= 3; i1++)
			System.out.println(dessert[i1] + " - " + dessert[i1]);
		bill = selectMenu(vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, choice, selectedMenu);
		System.out.println("name:" + name);
		System.out.println("contact no:" + mobNo);
		printBill(bill, vegMenu, nonVeg, dessert, vegPrice, nonvegPrice, dessertPrice, selectedMenu, choice);
		return bill;
	}
	public static int selectMenu(String[] vegMenu, String[] nonVeg, String[] dessert, int[] vegPrice, int[] nonVegPrice,
			int[] dessertPrice, int choice, int[] selectedMenu) {
		int j = 0;
		int m = 0;
		int total = 0;
		System.out.println("Select your menues:\n press 0 to exit menu type");
		Scanner sc = new Scanner(System.in);
		do {
			m = sc.nextInt();
			selectedMenu[j] = m;
			if (m < 0 || m > vegMenu.length || m > nonVeg.length || m > dessert.length)
				System.out.println("invalid input select valid menu");
			j++;

		} while (m != 0);

		for (int i1 = 0; i1 < selectedMenu.length; i1++) {
			int p = selectedMenu[i1];
			if (p == 0) {
				break;
			}
			if (choice == 1)
				total = total + vegPrice[p];
			else if (choice == 2)
				total = total + nonVegPrice[p];
			else if (choice == 3)
				total = total + dessertPrice[p];
		}

		return total;
	}

	public static void printBill(int total, String[] vegMenu, String[] nonVeg, String[] dessert, int[] vegPrice,
			int[] nonVegPrice, int[] dessertPrice, int[] selectedMenu, int choice) {

		for (int j = 0; j < selectedMenu.length; j++) {
			int s = selectedMenu[j];
			if (s == 0) {
				break;
			}
			if (choice == 1) {
				System.out.println(vegMenu[s] + " - " + vegPrice[s]);
			} else if (choice == 2)
				System.out.println(nonVeg[s] + " - " + nonVegPrice[s]);
			else if (choice == 3)
				System.out.println(dessert[s] + " - " + dessertPrice[s]);
		}

		System.out.println("total:  " + total);
	}

}
