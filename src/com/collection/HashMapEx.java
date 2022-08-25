package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String>  map=new HashMap<String,String>();
		map.put("br", "Brazil");
		map.put("in", "India");
		map.put("ge", "Germany");
		System.out.println("Implementing HashMap:");
		for (Map.Entry<String,String> entry:map.entrySet()) {
			System.out.println("country code:"+entry.getKey()+"  country Name:"+entry.getValue());
		}
		System.out.println("\n"+map.get("in"));
		
		TreeMap<String,String> treemap=new TreeMap<String,String>();
		treemap.put("ds","Sandwitch");
		treemap.put("l3", "pav-bhaji");
		treemap.put("l15", "chole-puri");
		treemap.put("b20","Coffee");
		
		System.out.println("\nImplementing TreeMap:");//ascending order will get
		for(Map.Entry<String, String> entry:treemap.entrySet()) {
			System.out.println("menu code:"+entry.getKey()+"  menu name:"+entry.getValue());
		}
		
		Hashtable<String,String> hashtable=new Hashtable<String,String>();
		hashtable.put("Ds","Sandwitch");
		hashtable.put("l3", "pav-bhaji");
		hashtable.put("l15", "chole-puri");
		hashtable.put("b20","Coffee");
		System.out.println("\n implementing hashtable:");
		for(Map.Entry<String, String> entry:hashtable.entrySet()){
			System.out.println("menu code:"+entry.getKey()+"  menu name:"+entry.getValue());
		}
		
	}

}
