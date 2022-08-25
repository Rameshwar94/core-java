package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> al=new ArrayList<Employee1>();
		al.add(new Employee1(101,"ram",21));
		al.add(new Employee1(102,"rameshwar",24));
		al.add(new Employee1(103,"premala",26));
		al.add(new Employee1(104,"siddhi",22));
		al.add(new Employee1(105,"swati",20));
		
		System.out.println("Ascending order:");
		Collections.sort(al);
		for(Employee1 emp:al) {
			System.out.println(emp);
		}
		System.out.println("\nDescending Ordre:");
		Collections.reverse(al);
		for(Employee1 emp:al) {
			System.out.println(emp);
		}
	}

}
