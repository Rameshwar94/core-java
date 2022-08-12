package com.oops;

public class Student1 {
	int id,age;
	String name;
	
	public Student1(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student1 [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Student1 s1=new Student1(101, 20, "premala");
Student1 s2=new Student1(102,23,"siddhi");
Student1 s3=(Student1) s2.clone();
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
