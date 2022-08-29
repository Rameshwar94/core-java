package com.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotations {

	@BeforeClass
	public static void beforClass() {
		System.out.println("In before Class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("in After class");
	}
	@Before
	public void before() {
		System.out.println("in Before");
	}
	@After
	public void after() {
		System.out.println("in after");
	}
	@Ignore
	public void ignore() {
		System.out.println("Ignored");
	}
	@Test
	public void test() {
		System.out.println("in test");
	}
}
