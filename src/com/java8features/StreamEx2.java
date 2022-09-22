package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Rameshwar","Premala","Sudhakar","Siddhi","Dnyaneshwar");
		List<String> longnames=names.stream().filter(str->str.length()>6 && str.length()<11).collect(Collectors.toList());
		//longnames.forEach(str->System.out.println(str));
		longnames.forEach(System.out::println);//method reference with :: operator

	}

}
