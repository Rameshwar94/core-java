package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CountATest {

	@Test
	public void test() {
		JunitEx junit=new JunitEx();
		int c=junit.countA("Premala");
		assertEquals(2, c);
	}

}
