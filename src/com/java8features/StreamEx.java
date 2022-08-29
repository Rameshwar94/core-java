package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Rameshwar","Premala","Sudhakar","Siddhi","Dnyaneshwar");

		//creating stream
		Stream<String> allNames=names.stream();
		//perform intermediate operations
		Stream<String> longNames=allNames.filter(str->str.length()>7);
		//perform terminal operations
		longNames.forEach(str->System.out.println(str));
		System.out.println();
		//above all methods in one line
		names.stream().filter(str->str.length()>7).forEach(str->System.out.println(str));
	}

}
