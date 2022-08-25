package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAge {

	@Test
	public void testCorrectAge() {
		Age age1=new Age();
		age1.setAge(18);
		assertTrue(age1.checkAge());
	}
	@Test
	public void testWrongAge() {
		Age age1=new Age();
		age1.setAge(11);
		assertFalse(age1.checkAge());
	}

}
