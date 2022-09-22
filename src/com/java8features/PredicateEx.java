package com.java8features;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		List<Student> list=Student.getStudentList();
		
		Predicate<Student> p1=s->s.getName().startsWith("r");
		Predicate<Student> p2=s->s.getAge()>23 && s.getName().startsWith("c");
		Predicate<Student> p3=s->s.getAge()<30;
		
		boolean b1=list.stream().anyMatch(p1);
		System.out.println(b1);
		System.out.println(list.stream().noneMatch(p2));
		System.out.println(list.stream().allMatch(p3));
		System.out.println(list.stream().anyMatch(p2));
	}

}
