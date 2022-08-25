package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {

	@Test
	public void testValidLogin() {
		LogIn login=new LogIn();
		login.setUsername("admin");
		login.setPassword("admin123");
		assertTrue(login.checkLogin());
	}
	@Test
	public void testInvlidLogin() {
		LogIn login=new LogIn();
		login.setUsername("admin1");
		login.setPassword("admin1234");
		assertFalse(login.checkLogin());
	}

}
