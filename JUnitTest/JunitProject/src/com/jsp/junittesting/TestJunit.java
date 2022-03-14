package com.jsp.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJunit {
	Account a1 = new Account("831","Nayum");
	Account a2 = new Account("143","Khan",100000);

	@Test
	public void testGetId() {
		assertTrue(a1.getId().equals("831"));
		assertEquals(a2.getName(),"Khan");
		
	}

}
