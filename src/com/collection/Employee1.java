package com.collection;

public class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	int age;
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		if(age==o.age) 
			return 0 ;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
			
		
	

}
