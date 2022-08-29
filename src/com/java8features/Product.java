package com.java8features;

public class Product {
	int productid;
	String prodName;
	float price;
	public Product(int productid, String prodName, float price) {
		super();
		this.productid = productid;
		this.prodName = prodName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", prodName=" + prodName + ", price=" + price + "]";
	}

}
