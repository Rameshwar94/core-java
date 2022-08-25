package com.filehandling;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String string;
	public Employee(int id, String string) {
		super();
		this.id = id;
		this.string = string;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", string=" + string + "]";
	}
	
}	