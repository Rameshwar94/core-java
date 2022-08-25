package com.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Entity> {

	@Override
	public int compare(Entity e1, Entity e2) {
		// TODO Auto-generated method stub
		if(e1.age==e2.age)
		return 0;
		else if(e1.age>e2.age)
			return 1;
		else
			return -1;
	}

}

class NameComparator implements Comparator<Entity>{

	@Override
	public int compare(Entity o1, Entity o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}