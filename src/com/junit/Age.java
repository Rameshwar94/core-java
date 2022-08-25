package com.junit;

public class Age {
 private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
boolean checkAge()
{
	if(getAge()>=18) {
		return true;
	}
	else
		return false;
	}
}
