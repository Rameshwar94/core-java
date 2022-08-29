package com.java8features;
@FunctionalInterface
interface Sayable1{
	String say(String str);
}

public class LambdWithSinglePara {

	public static void main(String[] args) {
		Sayable1 s1=(name)-> {
			return "Hello"+name;
		};
		System.out.println(s1.say(" Premala"));

	}

}
