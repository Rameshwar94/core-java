package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaInComparator {

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product(101,"mousepad",1200));
		list.add(new Product(102,"Laptop",60000));
		list.add(new Product(103,"CPU",20000));
		list.add(new Product(104,"Desktop",12000));
		list.add(new Product(105,"Speakers",3000));
		Collections.sort(list, (p1,p2)->{
			return p1.prodName.compareTo(p2.prodName);
		});
		list.forEach(obj->System.out.println(obj));
	}

}
