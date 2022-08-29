package com.java8features;

import java.util.Optional;

public class OptinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[10];
		str[5]="test";
	Optional<String> optional=	Optional.ofNullable(str[5]);
	if(optional.isPresent()) {
		String uppercase=str[5].toUpperCase();
		System.out.println(uppercase);
	}
	else {
		System.out.println("String is not present at 5th index");
	}
	}

}
//in spring u can not write try catch block,so we need Optional class