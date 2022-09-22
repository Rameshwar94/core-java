package com.designpatterns;

interface Iterator{
	public boolean hashNext();
	public Object next();
}

interface Container{
	public Iterator getIterator();
}

class CollectionNames implements Container{
public String names[]= {"premala","siddhi","ram","bandu","swati"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CollectionNamesIterate();
	}
	
}
private class CollectionNamesIterate implements Iterator{
	int i;

	@Override
	public boolean hashNext() {
		if(i<name)
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class IteratorPatternEx {

}
