package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<String>();
		vector.addElement("xyz");
		vector.addElement("pqr");
		vector.add("uvw");
		vector.add("uvw");
		vector.add(null);
		
		Enumeration<String> em=vector.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}

}
