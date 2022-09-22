package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int id;
	private	int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public static List<Student> getStudentList(){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(101,25,"prema"));
		list.add(new Student(102,22,"siddhi"));
		list.add(new Student(103,23,"ram"));
		list.add(new Student(104,25,"pihu"));
		list.add(new Student(105,24,"chiu"));
		return list;
	}
}
