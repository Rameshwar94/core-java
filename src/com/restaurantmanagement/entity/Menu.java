package com.restaurantmanagement.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

	private int menuId;
	private String menuName;
	private String description;
	private String menuType;
	private double price;
	
	public Menu() {
		
	}
	
	public Menu(int menuId, String menuName, String description, String menuType, double price) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.description = description;
		this.menuType = menuType;
		this.price = price;
	}

	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", description=" + description + ", menuType="
				+ menuType + ", price=" + price + "]";
	}

	public static Map<Integer, Menu> getMenu(){
		Map<Integer, Menu> menuList = new HashMap<Integer, Menu>();
		menuList.put(1, new Menu(1, "Rice", "Rice", "Veg", 120));
		menuList.put(2, new Menu(2, "Roti", "Roti", "Veg", 20));
		menuList.put(3, new Menu(3, "PaneerMasala", "Paneer Masala", "Veg", 125));
		menuList.put(4, new Menu(4, "BrinjalMasala", "Brinjal Masala", "Veg", 120));
		menuList.put(5, new Menu(5, "Nan", "Nan Roti", "Veg", 30));
		
		menuList.put(6, new Menu(6, "FriedChiken", "Fried Chiken", "NonVeg", 250));
		menuList.put(7, new Menu(7, "ChikenBiryani", "Chiken Biryani", "NonVeg", 200));
		menuList.put(8, new Menu(8, "FishCurry", "Fish Curry", "NonVeg", 300));
		
		menuList.put(9, new Menu(9, "Peda", "Peda", "Dessert", 50));
		menuList.put(10, new Menu(10, "Jilebi", "Jilebi", "Dessert", 40));
		menuList.put(11, new Menu(11, "GulabJamun", "Gulab Jamun", "Dessert", 60));
		menuList.put(12, new Menu(12, "Khir", "Khir", "Dessert", 80));
		
		return menuList;
	}
	
}
