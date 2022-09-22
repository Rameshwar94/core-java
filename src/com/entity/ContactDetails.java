package com.entity;

public class ContactDetails {

	private int contactId;
	private String name;
	private int contactNo;
	
	public ContactDetails() {
		
	}
	
	public ContactDetails(int contactId, String name, int contactNo) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.contactNo = contactNo;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
}
