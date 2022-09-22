package com.restaurantmanagement.entity;

public class Customer {
	
	private int custId;
	private String customerName;
	private String contactNumber;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", contactNumber=" + contactNumber
				+ "]";
	}
	
}
