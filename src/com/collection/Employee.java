package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		ArrayList<Entity> emp=new ArrayList<Entity>();
		emp.add(new Entity(1,"premala",24));
		emp.add(new Entity(2,"Siddhi",23));
		emp.add(new Entity(3,"Ram",30));
		emp.add(new Entity(4,"Swati",25));
		emp.add(new Entity(5,"prema",23));
		
		Iterator<Entity> itr=emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
