package com.restaurantmanagement.entity;

import java.util.HashMap;
import java.util.Map;

public class MenuType {

	private Integer id;
	private String menuType;
	
	public MenuType() {
		
	}

	public MenuType(Integer id, String menuType) {
		super();
		this.id = id;
		this.menuType = menuType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	@Override
	public String toString() {
		return "MenuType [id=" + id + ", menuType=" + menuType + "]";
	}
	
	public static Map<Integer, MenuType> getMenuTypes(){
		Map<Integer, MenuType> map = new HashMap<Integer, MenuType>();
		map.put(1, new MenuType(1, "Veg"));
		map.put(2, new MenuType(2, "NonVeg"));
		map.put(3, new MenuType(3, "Dessert"));
		return map;
	}
	
}
