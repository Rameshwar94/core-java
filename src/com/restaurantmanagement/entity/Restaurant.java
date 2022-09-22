package com.restaurantmanagement.entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private String description;
	private String address;
	
	public Restaurant() {
		
	}
	
	public Restaurant(int restaurantId, String restaurantName, String description, String address) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.description = description;
		this.address = address;
	}

	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", description="
				+ description + ", address=" + address + "]";
	}

	public static List<Restaurant> getRestaurants(){
		List<Restaurant> list = new ArrayList<Restaurant>();
		
		list.add(new Restaurant(1, "Radhika Restaurant", "Radhika Restaurant - Veg / VegNon", "Pune"));
		list.add(new Restaurant(2, "Annapurna Restaurant", "Annapurna Restaurant - Veg / VegNon", "Pune"));
		list.add(new Restaurant(3, "Lakshmi Restaurant", "Lakshmi Restaurant - Veg / VegNon", "Pune"));
		
		return list;
	}
}
