package com.collection;

public class Entity {
	
	int id;
	String name;
	int age;
	public Entity(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
