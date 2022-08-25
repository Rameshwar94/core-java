package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareTest {//either start or end name with Test word

	@Test
	public void test() {//we can change the method name but @Test is compulsory
		JunitEx junit=new JunitEx();
		int sq=junit.square(6);
		assertEquals(25, sq);
	}

}
