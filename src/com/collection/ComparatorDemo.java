package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entity> al=new ArrayList<Entity>();
		al.add(new Entity(101,"ram",21));
		al.add(new Entity(102,"rameshwar",24));
		al.add(new Entity(103,"premala",26));
		al.add(new Entity(104,"siddhi",22));
		al.add(new Entity(105,"swati",20));
		
		System.out.println("Sorting based on age:");
		Collections.sort(al,new AgeComparator());
		for (Entity entity : al) {
			System.out.println(entity);
		}
		System.out.println("\nSorting based on name:");
		Collections.sort(al, new NameComparator());
		for (Entity entity : al) {
			System.out.println(entity);
		}
	}

}
