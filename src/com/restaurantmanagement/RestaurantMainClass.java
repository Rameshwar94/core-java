package com.restaurantmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.restaurantmanagement.entity.Customer;
import com.restaurantmanagement.entity.Menu;
import com.restaurantmanagement.entity.MenuType;
import com.restaurantmanagement.entity.Restaurant;

public class RestaurantMainClass {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		//Customer customer = getCustomer(sc);
		//Restaurant restaurant = getRestaurant(sc);
		String choice;
		List<List<Entry<Integer, Menu>>> selectedMenu = new ArrayList<List<Entry<Integer, Menu>>>();
		do {
			Entry<Integer, MenuType> menuType = getMenuType(sc);
			//sc.nextLine();
			List<Entry<Integer, Menu>> result = getSelectedMenu(sc, menuType);
			selectedMenu.add(result);
			System.out.println("do you want to add more menu type? Y/N");
			choice = sc.nextLine();
		} while(!choice.equalsIgnoreCase("n"));
		
	}

	private static Restaurant getRestaurant(Scanner sc) {
		System.out.println("Enter number to select restaurant: ");
		List<Restaurant> restaurants = Restaurant.getRestaurants();
		restaurants.stream().forEach(rest->System.out.println("\t"+rest.getRestaurantId()+ " : " + rest.getRestaurantName()));
		
		Restaurant restaurant = new Restaurant();
		restaurant = restaurants.stream().filter(r->r.getRestaurantId()==sc.nextInt()).findFirst().get();
		return restaurant;
	}

	public static Customer getCustomer(Scanner sc) {
		Customer customer = new Customer();
		customer.setCustId(101);
		System.out.println("Enter customer name:");
		customer.setCustomerName(sc.nextLine());
		System.out.println("Enter contact number:");
		customer.setContactNumber(sc.nextLine());
		//System.out.println(restaurant);
		return customer;
	}
	
	public static Entry<Integer, MenuType> getMenuType(Scanner sc) {
		System.out.println("select menu type:");
		Map<Integer, MenuType> menuTypeMap = MenuType.getMenuTypes();
		menuTypeMap.entrySet().forEach(map->System.out.println("\t"+map.getKey()+" : "+map.getValue().getMenuType()));;
		
		Entry<Integer, MenuType> menuType = menuTypeMap.entrySet().stream().filter(type->type.getKey()==sc.nextInt()).findFirst().get();
		System.out.println(menuType);
		return menuType;
	}
	
	private static List<Entry<Integer, Menu>> getSelectedMenu(Scanner sc, Entry<Integer, MenuType> menuType) {
		System.out.println("Select menu:");
		Map<Integer, Menu> menuList = Menu.getMenu();
		menuList.entrySet().stream().filter(m->m.getValue().getMenuType()==menuType.getValue().getMenuType())
			.forEach(menu->System.out.println("\t"+menu.getKey()+" : "+ menu.getValue().getMenuName()+" : "+ menu.getValue().getPrice()));
		Integer choice = 0;
		String ch;
		List<Entry<Integer, Menu>> result = new ArrayList<Entry<Integer, Menu>>();
		do {
			choice = sc.nextInt();
			sc.nextLine();
			final int option=choice;
			if(choice>0) {
				Entry<Integer, Menu> selectedMenu = menuList.entrySet().stream().filter(menu->menu.getKey()==option).findFirst().get();
				result.add(selectedMenu);
			}
			System.out.println("do you want to add more menu? Y/N");
			ch = sc.nextLine();
			//System.out.println("Please enter next menu:");
		} while(!ch.equalsIgnoreCase("n"));
		System.out.println(result);
		return result;
	}
	
}
