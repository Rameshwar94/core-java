package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entity> list=new ArrayList<Entity>();
		list. add(new Entity(101,"premala",20));
		list.add(new Entity(102,"siddhi",19));
		list.add(new Entity(103,"ram",23));
		list.add(new Entity(104,"pillu",3));
	
		
		System.out.println("using for each:");
		for(Entity e:list) {
			System.out.println(e);
		}
		System.out.println("using iterator:");
		Iterator<Entity> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
