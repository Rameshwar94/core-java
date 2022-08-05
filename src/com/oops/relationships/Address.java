package com.oops.relationships;

public class Address {
	int pinCode;
	String addrLine,street,city,state,country;
	public Address() {
		addrLine=" Room no:123, Sasane Ali,hadpsar";
		street="Solapur- pune Highway";
		city="Hadpsar,Pune";
		pinCode=411028;
		country="India";
	}
	public Address(String addrLine,String street,String city,int pinCode,String country) {
		this.addrLine=addrLine;
		this.street=street;
		this.city=city;
		this.pinCode=pinCode;
		this.country=country;
	}
	public void display() {
		System.out.println("Addressline:"+addrLine);
		System.out.println("Street:"+street);
		System.out.println("City:"+city);
		System.out.println("pincode:"+pinCode);
		System.out.println("Country:"+country);
	}

}
