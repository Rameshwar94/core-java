package com.oops.relationships;

public class Employee {
	int id;
	String name;
	MyDate dob;
	Address add;
		
		public Employee() {
			id=111;
			name="Premala";
			dob=new MyDate();
			add=new Address();
		}
		public Employee(int id,String name,MyDate dob,Address add) {
			this.id=id;
			this.name=name;
			this.dob=dob;
			this.add=add;
		}
		public void display() {
			System.out.println("Id:"+id);
			System.out.println("Name:"+name);
			dob.display();
			add.display();
		}
}
