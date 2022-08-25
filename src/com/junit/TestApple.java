package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApple {

	@Test    //positive test case
	public void testCorrectColor() {
		Apple apple=new Apple();
		apple.setColor("green");
		assertTrue(apple.checkColor());
	}
	@Test    //negative Test case
	public void testWrongColor() {
		Apple apple=new Apple();
		apple.setColor("blue");
		assertFalse(apple.checkColor());
	}

}
