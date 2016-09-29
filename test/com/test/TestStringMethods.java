package com.test;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class TestStringMethods {

	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testInternedString(){
		String message = new String("Hello, world!");
		
		String message2 = "Hello, world!";
		String message3 = "Hello, world!";
		Assert.assertSame(message2, message3);
		Assert.assertSame(message2, message3);
		
		
	}
	
}
