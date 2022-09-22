package com.designpatterns;

class SingleObject{
	//create an object
private static SingleObject instance=new SingleObject();
	//make private constructor so class can not be instantiated
	private SingleObject() {}
	public static SingleObject getInstance() {
		return instance;
	}
	public void show() {
		System.out.println("Hello Singleton!!");
	}
}


public class SingletonEx {

	public static void main(String[] args) {
		//SingleObject obj=new SingleObject();  //  can not create object because constructor is private
		SingleObject ref=SingleObject.getInstance();
		ref.show();

		
		System.out.println(ref.hashCode());
		System.out.println(ref.hashCode());
	}

}
