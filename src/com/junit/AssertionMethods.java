package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionMethods {

	@Test
	public void testAssertion() {
		String str1=new String("Siddhi");
		String str2=new String("Siddhi");
		String str3="Ram";
		String str4="Ram";
		String str5=null;
		int a=10;
		int b=10;
		//check that 2 objects are equal
		assertEquals(str1,str2);
		assertTrue(a==b);
		assertFalse(a>b);
		assertNull(str5);
		assertSame(str4,str3);
		assertNotSame(str1,str2);
		assertNotNull(str1);
		String a1[]= {"one","two","three"};
		String a2[]= {"one","two","three"};
		assertArrayEquals(a1,a2);
		
	}
}
